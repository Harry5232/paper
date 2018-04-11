import spock.lang.*
import com.test.t.*
import com.test.t3.Scores

class JavaSpec extends Specification {
  

 //"DIFFICULT" type
 @Scores(points=2.0f)
 @Unroll
 def "integrationOfSquare"() {
    setup:
            com.test.t.HW1Solution ob = new com.test.t.HW1Solution();
    expect:
            ob.integrationOfSquare(a,b,c) == d
             
    where:
              a | b | c || d
         	  20.0| 35.0| 10|| (double)12986.111111111117
              60.0| 35.0| 10|| (double)-64441.87242798354
              80.0| 35.0| 10|| (double)-175625.0
                 	     
  }
 

 //"DIFFICULT" type
 @Scores(points=7.0f)
 @Unroll
 def "reverse"() {
    setup:
            com.test.t.HW1Solution ob = new com.test.t.HW1Solution();
    expect:
            ob.reverse(a) == c
             
    where:
              a || c
         	  10|| (int)1
              45|| (int)54
              70|| (int)7
                 	     
  }
 

 //"DIFFICULT" type
 @Scores(points=2.0f)
 @Unroll
 def "isArmstrongNumber"() {
    setup:
            com.test.t.HW1Solution ob = new com.test.t.HW1Solution();
    expect:
            ob.isArmstrongNumber(a) == c
             
    where:
              a || c
         	  20|| (boolean)false
              60|| (boolean)false
              80|| (boolean)false
                 	     
  }
 

 //"DIFFICULT" type
 @Scores(points=2.0f)
 @Unroll
 def "findAllArmstrongNumbers"() {
    setup:
            com.test.t.HW1Solution ob = new com.test.t.HW1Solution();
    expect:
            ob.findAllArmstrongNumbers(a,b) == c
             
    where:
              a | b || c
         	  200| 400|| "370,371"
              100| 999|| "153,370,371,407"
              80| 35|| ""
                 	     
  }
 

 //"DIFFICULT" type
 @Scores(points=5.0f)
 @Unroll
 def "numOfFactors"() {
    setup:
            com.test.t.HW1Solution ob = new com.test.t.HW1Solution();
    expect:
            ob.numOfFactors(a,b,c) == d
             
    where:
              a | b | c || d
         	  10| 20| 20|| (int)0
              45| 60| 20|| (int)0
              70| 80| 20|| (int)0
                 	     
  }
 

 //"HARD" type
 @Scores(points=9.0f)
 @Unroll
 def "numberOfBitOne"() {
    setup:
            com.test.t.HW1Solution ob = new com.test.t.HW1Solution();
    expect:
            ob.numberOfBitOne(a) == c
             
    where:
              a || c
         	  20|| (int)2
              60|| (int)4
              80|| (int)2
                 	     
  }
 

 //"EASY" type
 @Scores(points=5.0f)
 @Unroll
 def "diamond"() {
    setup:
            com.test.t.HW1Solution ob = new com.test.t.HW1Solution();
    expect:
            ob.diamond(a) == c
             
    where:
              a || c
         	  4|| "---4---\n--33--\n-22222-\n1111111\n-22222-\n--333--\n---4---\n"
              3|| "--3--\n-222-\n11111\n-222-\n--3--\n"
              6|| "-----6-----\n----555----\n---44444---\n--3333333--\n-222222222-\n11111111111\n-222222222-\n--3333333--\n---44444---\n----555----\n-----6-----\n"
                 	     
  }
 

 //"EASY" type
 @Scores(points=4.0f)
 @Unroll
 def "numberOfBitChanges"() {
    setup:
            com.test.t.HW1Solution ob = new com.test.t.HW1Solution();
    expect:
            ob.numberOfBitChanges(a) == c
             
    where:
              a || c
         	  20|| (int)4
              35|| (int)3
              8|| (int)2
                 	     
  }
 
 
}