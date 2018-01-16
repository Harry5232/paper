# Report for JavaSpec, created on 1/12, by Harry.

##Summary

* Total Runs: 12
* Success Rate: 75.0%
* Failures: 3
* Errors:   0
* Skipped:  0
* Total time: 1.304 seconds
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
|  50   |  apple  |  9  |(FAIL)


Condition not satisfied:

ob.sumOfAllFactors(a,b) == c
|  |               | |  |  |
|  93              50|  |  9
|                    |  false
|                    apple
com.test.t.HW4Solution@1d7b493a

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

Result: **FAILURE**

* Given: 

     HW4Solution ob = new HW4Solution()

* Expect: 

     ob.sumOfAllFactors(a,b) == c

* Where: 


|   a   |    b    |  c  |
|-------|---------|-----|
|  39   |  apple  |  5  |(FAIL)


Condition not satisfied:

ob.sumOfAllFactors(a,b) == c
|  |               | |  |  |
|  56              39|  |  5
|                    |  false
|                    apple
com.test.t.HW4Solution@8e482c2

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

Result: **FAILURE**

* Given: 

     HW4Solution ob = new HW4Solution()

* Expect: 

     ob.numberOfZeros(a,b) == c

* Where: 


|   a   |   b   |  c  |
|-------|-------|-----|
|  39   |  47   |  2  |(FAIL)


Condition not satisfied:

ob.numberOfZeros(a,b) == c
|  |             | |  |  |
|  28            | 47 |  2
|                39   false
com.test.t.HW4Solution@6b4e5c9

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

Result: **PASS**

* Given: 

     HW4Solution ob = new HW4Solution()

* Expect: 

     ob.bits2Float(a,b,c) == d

* Where: 


|   a   |   b   |   c   |         d         |
|-------|-------|-------|-------------------|
|  41   |  48   |  12   |  -1.6543636E-24   |(PASS)


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
|  37   |  41   |  21   |  -1.292473E-26  |(PASS)


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
|  10   |  20   |  00000000_00000000_00000000_00001010  |(PASS)


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

