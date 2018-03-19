# Report for JavaSpec, created on 3/19, by Harry.

##Summary

* Total Runs: 12
* Success Rate: 83.33%
* Failures: 2
* Errors:   0
* Skipped:  0
* Total time: 1.603 seconds
* Total scores: 11.0


## Features

### dumpAsBinaryString [0]

Result: **FAILURE**

* Given: 

     HW4Solution ob = new HW4Solution()

* Expect: 

     ob.dumpAsBinaryString(a,b) == c

* Where: 


|   a   |   b   |                  c                  |
|-------|-------|-------------------------------------|
|  10   |  20   |  00000000_00000000_00000000001010   |(FAIL)


Condition not satisfied:

ob.dumpAsBinaryString(a,b) == c
|  |                  | |  |  |
|  |                  | 20 |  00000000_00000000_00000000001010
|  |                  10   false
|  |                       3 differences (91% similarity)
|  |                       00000000_00000000_00000000(_)00(00)1010
|  |                       00000000_00000000_00000000(-)00(--)1010
|  00000000_00000000_00000000_00001010
com.test.t.HW4Solution@1b3bafe7

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
|  45   |  60   |  00000000_00000000_00000000_00101101  |(PASS)


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
|  70   |  80   |  00000000_00000000_00000000_01000110  |(PASS)


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
|  1  |  10   |  5  |  6.018535E-36   |(PASS)


--------------------------------------------------------------------

### bits2Float [1]

Result: **FAILURE**

* Given: 

     HW4Solution ob = new HW4Solution()

* Expect: 

     ob.bits2Float(a,b,c) == d

* Where: 


|   a   |   b   |  c  |       d       |
|-------|-------|-----|---------------|
|  35   |  21   |  1  |  -1.2325953   |(FAIL)


Condition not satisfied:

ob.bits2Float(a,b,c) == d
|  |          | | |  |  |
|  |          35| 1  |  -1.2325953
|  |            21   false
|  -1.2325953E-32
com.test.t.HW4Solution@5d8fbcdf

--------------------------------------------------------------------

### bits2Float [2]

Result: **PASS**

* Given: 

     HW4Solution ob = new HW4Solution()

* Expect: 

     ob.bits2Float(a,b,c) == d

* Where: 


|   a   |   b   |   c   |         d         |
|-------|-------|-------|-------------------|
|  35   |  44   |  46   |  -1.0339814E-25   |(PASS)


--------------------------------------------------------------------

### sumOfAllFactors [0]

Result: **PASS**

* Given: 

     HW4Solution ob = new HW4Solution()

* Expect: 

     ob.sumOfAllFactors(a,b) == c

* Where: 


|   a   |    b    |   c   |
|-------|---------|-------|
|  50   |  apple  |  93   |(PASS)


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
|  80   |  banana   |  186  |(PASS)


--------------------------------------------------------------------

### sumOfAllFactors [2]

Result: **PASS**

* Given: 

     HW4Solution ob = new HW4Solution()

* Expect: 

     ob.sumOfAllFactors(a,b) == c

* Where: 


|   a   |    b    |   c   |
|-------|---------|-------|
|  35   |  apple  |  48   |(PASS)


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
|  30   |  40   |  28   |(PASS)


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
|  50   |  70   |  29   |(PASS)


--------------------------------------------------------------------

### numberOfZeros [2]

Result: **PASS**

* Given: 

     HW4Solution ob = new HW4Solution()

* Expect: 

     ob.numberOfZeros(a,b) == c

* Where: 


|   a   |   b   |   c   |
|-------|-------|-------|
|  22   |  37   |  29   |(PASS)


--------------------------------------------------------------------

