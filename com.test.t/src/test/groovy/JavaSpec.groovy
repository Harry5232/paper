import spock.lang.*
import com.test.t.*


class JavaSpec extends Specification {
  

 //5.0 points, "HARD" type
 //3 test cases  
 @Unroll
 def "sumOfAllFactors"() {
    setup:
            HW4Solution ob = new HW4Solution();
    expect:
            ob.sumOfAllFactors(a,b) == c
             
    where:
              a | b || c
         	  50| "apple"|| (int)9
              80| "banana"|| (int)186
              39| "apple"|| (int)5
                 	     
  }
 

 //6.0 points, "EASY" type
 //3 test cases  
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
              39| 47|| (int)2
                 	     
  }
 

 //8.0 points, "NORMAL" type
 //3 test cases  
 @Unroll
 def "bits2Float"() {
    setup:
            HW4Solution ob = new HW4Solution();
    expect:
            ob.bits2Float(a,b,c) == d
             
    where:
              a | b | c || d
         	  1| 10| 5|| (float)6.018535E-36
              41| 48| 12|| (float)-1.6543636E-24
              37| 41| 21|| (float)-1.292473E-26
                 	     
  }
 

 //2.0 points, "DIFFICULT" type
 //3 test cases  
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
 
 
}