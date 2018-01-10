# Report for JavaSpec, time is 1/10.

##Summary

* Total Runs: 12
* Success Rate: 75.0%
* Failures: 3
* Errors:   0
* Skipped:  0
* Total time: 0.303 seconds
* Total scores: 


## Features

### sumOfAllFactors [0]

Result: **FAILURE**

* Given: 

     HW4Solution ob = new HW4Solution()

* Expect: 

     ob.sumOfAllFactors(a,b) == c

* Where: 


|   a   |    b    |  c  |
|-------|---------|-----|
|  50   |  apple  |  9  |


Condition not satisfied:

ob.sumOfAllFactors(a,b) == c
|  |               | |  |  |
|  93              50|  |  9
|                    |  false
|                    apple
com.test.t.HW4Solution@12a5615d

--------------------------------------------------------------------

### sumOfAllFactors [1]

Result: **PASS**

* Given: 

     HW4Solution ob = new HW4Solution()

* Expect: 

     ob.sumOfAllFactors(a,b) == c

* Where: 


|   a   |     b     |   c   |
|-------|-----------|-------|
|  80   |  banana   |  186  |


--------------------------------------------------------------------

### sumOfAllFactors [2]

Result: **FAILURE**

* Given: 

     HW4Solution ob = new HW4Solution()

* Expect: 

     ob.sumOfAllFactors(a,b) == c

* Where: 


|   a   |    b    |  c  |
|-------|---------|-----|
|  39   |  apple  |  5  |


Condition not satisfied:

ob.sumOfAllFactors(a,b) == c
|  |               | |  |  |
|  56              39|  |  5
|                    |  false
|                    apple
com.test.t.HW4Solution@180e9b96

--------------------------------------------------------------------

### numberOfZeros [0]

Result: **PASS**

* Given: 

     HW4Solution ob = new HW4Solution()

* Expect: 

     ob.numberOfZeros(a,b) == c

* Where: 


|   a   |   b   |   c   |
|-------|-------|-------|
|  30   |  40   |  28   |


--------------------------------------------------------------------

### numberOfZeros [1]

Result: **PASS**

* Given: 

     HW4Solution ob = new HW4Solution()

* Expect: 

     ob.numberOfZeros(a,b) == c

* Where: 


|   a   |   b   |   c   |
|-------|-------|-------|
|  50   |  70   |  29   |


--------------------------------------------------------------------

### numberOfZeros [2]

Result: **FAILURE**

* Given: 

     HW4Solution ob = new HW4Solution()

* Expect: 

     ob.numberOfZeros(a,b) == c

* Where: 


|   a   |   b   |  c  |
|-------|-------|-----|
|  39   |  47   |  2  |


Condition not satisfied:

ob.numberOfZeros(a,b) == c
|  |             | |  |  |
|  28            | 47 |  2
|                39   false
com.test.t.HW4Solution@5a31193b

--------------------------------------------------------------------

### bits2Float [0]

Result: **PASS**

* Given: 

     HW4Solution ob = new HW4Solution()

* Expect: 

     ob.bits2Float(a,b,c) == d

* Where: 


|  a  |   b   |  c  |        d        |
|-----|-------|-----|-----------------|
|  1  |  10   |  5  |  6.018535E-36   |


--------------------------------------------------------------------

### bits2Float [1]

Result: **PASS**

* Given: 

     HW4Solution ob = new HW4Solution()

* Expect: 

     ob.bits2Float(a,b,c) == d

* Where: 


|   a   |   b   |   c   |         d         |
|-------|-------|-------|-------------------|
|  41   |  48   |  12   |  -1.6543636E-24   |


--------------------------------------------------------------------

### bits2Float [2]

Result: **PASS**

* Given: 

     HW4Solution ob = new HW4Solution()

* Expect: 

     ob.bits2Float(a,b,c) == d

* Where: 


|   a   |   b   |   c   |        d        |
|-------|-------|-------|-----------------|
|  37   |  41   |  21   |  -1.292473E-26  |


--------------------------------------------------------------------

### dumpAsBinaryString [0]

Result: **PASS**

* Given: 

     HW4Solution ob = new HW4Solution()

* Expect: 

     ob.dumpAsBinaryString(a,b) == c

* Where: 


|   a   |   b   |                   c                   |
|-------|-------|---------------------------------------|
|  10   |  20   |  00000000_00000000_00000000_00001010  |


--------------------------------------------------------------------

### dumpAsBinaryString [1]

Result: **PASS**

* Given: 

     HW4Solution ob = new HW4Solution()

* Expect: 

     ob.dumpAsBinaryString(a,b) == c

* Where: 


|   a   |   b   |                   c                   |
|-------|-------|---------------------------------------|
|  45   |  60   |  00000000_00000000_00000000_00101101  |


--------------------------------------------------------------------

### dumpAsBinaryString [2]

Result: **PASS**

* Given: 

     HW4Solution ob = new HW4Solution()

* Expect: 

     ob.dumpAsBinaryString(a,b) == c

* Where: 


|   a   |   b   |                   c                   |
|-------|-------|---------------------------------------|
|  70   |  80   |  00000000_00000000_00000000_01000110  |


--------------------------------------------------------------------

