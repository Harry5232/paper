import spock.lang.*
import com.test.t.*
import com.test.t3.Scores

class JavaSpec extends Specification {
  

 //"DIFFICULT" type
 //3 test cases  
 @Scores(points=2.0f)
 @Unroll
 def "dumpAsBinaryString"() {
    setup:
            HW4Solution ob = new HW4Solution();
    expect:
            ob.dumpAsBinaryString(a,b) == c
             
    where:
              a | b || c
         	  10| 20|| "00000000_00000000_00000000_00001010"
              45| 60|| "00000000_00000000_00000000_00101101"
              70| 80|| "00000000_00000000_00000000_01000110"
                 	     
  }

 
 //"EASY" type
 //3 test cases  
 @Scores(points=6.0f)
 @Unroll
 def "numberOfZeros"() {
    setup:
            HW4Solution ob = new HW4Solution();
    expect:
            ob.numberOfZeros(a,b) == c
             
    where:
              a | b || c
         	  30| 40|| (int)28
              50| 70|| (int)29
              26| 14|| (int)29
                 	     
  }
 

 //"NORMAL" type
 //3 test cases  
 @Scores(points=8.0f)
 @Unroll
 def "bits2Float"() {
    setup:
            HW4Solution ob = new HW4Solution();
    expect:
            ob.bits2Float(a,b,c) == d
             
    where:
              a | b | c || d
         	  1| 10| 5|| (float)6.018535E-36
              27| 48| 24|| (float)-1.654366E-24
              44| 38| 23|| (float)-1.6155916E-27
                 	     
  }
 

 //"HARD" type
 //3 test cases  
 @Scores(points=5.0f)
 @Unroll
 def "sumOfAllFactors"() {
    setup:
            HW4Solution ob = new HW4Solution();
    expect:
            ob.sumOfAllFactors(a,b) == c
             
    where:
              a | b || c
         	  50| "apple"|| (int)93
              80| "banana"|| (int)186
              48| "apple"|| (int)124
                 	     
  }
 
 
}