<% def stats = utils.aggregateStats( data )
   def stats2 = utils.aggregateStats2( data )
 %># Specification run results<% if (projectName && projectVersion) {
 %>

## Project: ${projectName}, Version: ${projectVersion} <%
  }
 %>

## Specifications summary

<small>Created on ${new Date()} by ${System.properties['user.name']}</small>
<% 
//用來對齊
def t1 = ( String.valueOf(stats.total) ).length()
def t2 = ( String.valueOf(stats.passed) ).length()
def t3 = ( String.valueOf(stats.failed) ).length()
def t4 = ( String.valueOf(stats.fFails) ).length()
def t5 = ( String.valueOf(stats.fErrors) ).length()
def t6 = ( String.valueOf(stats.successRate) ).length()
def t7 = ( String.valueOf(stats.time) ).length()
def t8 = ( String.valueOf(stats2.grades) ).length()

def f = {num ->
   for(int i=0;i<10-num;i++){
   		out << " "		
   
   }
}
def f2 = {num ->
   for(int i=0;i<18-num;i++){
   		out << " "		
   
   }
}

%>


|   Total  |  Passed  |  Failed  | Feature  |  Feature |     Success      |  Total   |   Total  |                          
|   Spec   |   Spec   |   Spec   | failures |  errors  |      rate        | time(ms) |   scores |
|----------|----------|----------|----------|----------|------------------|----------|----------|
|<%f(t1)%>${stats.total}|<%f(t2)%>${stats.passed}|<%f(t3)%>${stats.failed}|<%f(t4)%>${stats.fFails}|<%f(t5)%>${stats.fErrors}|<%f2(t6)%>${stats.successRate}|<%f(t7)%>${stats.time}|<%f(t8)%>${stats2.grades}|



## Specifications
<%  

%>

|   Name   | Features |  Failed  |  Errors  |  Skipped |      Success     |   Time   |   Total  |
|   Spec   |          |          |          |          |       rate       |   (ms)   |   scores |
|----------|----------|----------|----------|----------|------------------|----------|----------|
<% data.each { name, map ->
      def s = map.stats
//用來對齊
def t21 = ( String.valueOf(name) ).length()
def t22 = ( String.valueOf(s.totalRuns) ).length()
def t23 = ( String.valueOf(s.failures) ).length()
def t24 = ( String.valueOf(s.errors) ).length()
def t25 = ( String.valueOf(s.skipped) ).length()
def t26 = ( String.valueOf(s.successRate2) ).length()
def t27 = ( String.valueOf(s.time) ).length()
def t28 = ( String.valueOf(s.grades) ).length()
      
 %>|<%f(t21)%>$name|<%f(t22)%>${s.totalRuns}|<%f(t23)%>${s.failures}|<%f(t24)%>${s.errors}|<%f(t25)%>${s.skipped}|<%f2(t26)%>${s.successRate2}|<%f(t27)%>${s.time}|<%f(t28)%>${s.grades}|
<% }
 %>

