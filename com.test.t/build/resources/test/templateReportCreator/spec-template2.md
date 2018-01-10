<%
    def stats = utils.stats( data )
    def d = new Date();
    def month = d.getMonth()+1
    def date = d.getDate()
 %># Report for ${utils.getSpecClassName( data )}, time is ${month}/${date}.
<%
def ff = {num,t ->
   def s=""
   for(int i=0;i<num;i++){
   		 s=s+t
   	}
   	return s
} 
%>
##Summary

* Total Runs: ${stats.totalRuns}
* Success Rate: ${fmt.toPercentage(stats.successRate)}
* Failures: ${stats.failures}
* Errors:   ${stats.errors}
* Skipped:  ${stats.skipped}
* Total time: ${fmt.toTimeDuration(stats.time)}
* Total scores: 
<%
    def specTitle = utils.specAnnotation( data, spock.lang.Title )?.value()
    if ( specTitle ) {
        specTitle.split('\n').each { out << '##' << it << '\n' }
    }
    if ( data.info.narrative ) {
        if ( specTitle ) { out << '\n' }
        out << '<pre>\n' << data.info.narrative << '\n</pre>'
    }
    
    def writeIssuesOrSees = { issues, description ->
        if ( issues?.value() ) {
            out << '\n#### ' << description << ':\n\n'
            issues.value().each { issue ->
                out << '* ' << issue << '\n'
            }
        }
    }
    writeIssuesOrSees( utils.specAnnotation( data, spock.lang.Issue ), 'Issues' )
    writeIssuesOrSees( utils.specAnnotation( data, spock.lang.See ), 'See' )
%>

## Features
<%
    features.eachFeature { name, result, blocks, iterations, params ->
%>
### $name
<% 
 writeIssuesOrSees( description.getAnnotation( spock.lang.Issue ), 'Issues' )
 writeIssuesOrSees( description.getAnnotation( spock.lang.See ), 'See' )
%>
Result: **$result**
<%
        for ( block in blocks ) {
 %>
* ${block.kind} ${block.text}
<%
          if ( block.sourceCode ) {
              // out << "\n```\n"
              block.sourceCode.each { codeLine ->
                  out << '\n' << '     ' << codeLine << '\n'
              }
              // out << "```\n"
          }
        }
        def executedIterations = iterations.findAll { it.dataValues || it.errors }
        if ( params && executedIterations ) {
   
 %>
<% //| ${params.join( ' | ' )} |
 // |${params.collect { ( '-' * ( it.size() + 2 ) ) + '|' }.join()}
 %>
<%
            for ( iteration in executedIterations ) {
            	def datanum = iteration.dataValues.size()
            	def count = 0
            	
            	//印出 |a|b|c
            	out << "|"
            	for(v in iteration.dataValues){
            	    def len = ( String.valueOf(v) ).length()
            	    if(len %2 == 0){
            	    	len = len +1
            	    }
            	    out <<ff((( len+3)/2)," ")<<params[count]<<ff((( len+3)/2)," ")<<"|"
            	    count ++      	 
            	}
            	out<<"\n"
            	
            	//中間隔線----
            	out << "|"
            	for(v in iteration.dataValues){
            	    def len = ( String.valueOf(v) ).length()
            	    if(len %2 == 0){
            	    	len = len +1
            	    }
            	    out <<ff((len+4),"-")<<"|"
            	        	 
            	}
            	out<<"\n"
            	
            	//印出 |5|80|93
            	out << "|"
            	for(v in iteration.dataValues){
            	    def len = ( String.valueOf(v) ).length()
            	    def e = 2
            	    if(len %2 == 0){
            	    	e = 3
            	    }

            	    out <<ff(2," ")<<v<<ff(e," ")<<"|"
            	        	 
            	}
                out<<"\n"  

%><%//   | ${iteration.dataValues.join( ' | ' )} | ${iteration.errors ? '(FAIL)' : '(PASS)'} %>
<%          }

        }
        def problems = executedIterations.findAll { it.errors }
        if ( problems ) {
            // out << "\nThe following problems occurred:\n\n"
            for ( badIteration in problems ) {
                if ( badIteration.dataValues ) {
                    // out << '* ' << badIteration.dataValues << '\n'
                }
                for ( error in badIteration.errors ) {
                    // out << '```\n' << error << '\n```\n'
                    out << "\n" << error
                }
            }
        }
   out << "\n--------------------------------------------------------------------\n"
    }
 %>
