# Report for JavaSpec

##Summary

* Total Runs: 12
* Success Rate: 75.0%
* Failures: 3
* Errors:   0
* Skipped:  0
* Total time: 0.243 seconds
* Total scores: 



## Features

### bits2Float [0]

Result: **FAILURE**

* Given: 

```
HW4Solution ob = new HW4Solution()
```

* Expect: 

```
ob.bits2Float(a,b,c) == d
```

* Where: 

 | a | b | c | d |
 |---|---|---|---|
 | 1 | 10 | 5 | 6.01 | (FAIL)

The following problems occurred:

* [1, 10, 5, 6.01]
```
Condition not satisfied:

ob.bits2Float(a,b,c) == d
|  |          | | |  |  |
|  |          1 | 5  |  6.01
|  6.018535E-36 10   false
com.test.t.HW4Solution@1d7b493a

```

--------------------------------------------------------------------

### bits2Float [1]

Result: **PASS**

* Given: 

```
HW4Solution ob = new HW4Solution()
```

* Expect: 

```
ob.bits2Float(a,b,c) == d
```

* Where: 

 | a | b | c | d |
 |---|---|---|---|
 | 31 | 49 | 43 | -3.3087394E-24 | (PASS)

--------------------------------------------------------------------

### bits2Float [2]

Result: **PASS**

* Given: 

```
HW4Solution ob = new HW4Solution()
```

* Expect: 

```
ob.bits2Float(a,b,c) == d
```

* Where: 

 | a | b | c | d |
 |---|---|---|---|
 | 18 | 36 | 50 | -4.038992E-28 | (PASS)

--------------------------------------------------------------------

### numberOfZeros [0]

Result: **FAILURE**

* Given: 

```
HW4Solution ob = new HW4Solution()
```

* Expect: 

```
ob.numberOfZeros(a,b) == c
```

* Where: 

 | a | b | c |
 |---|---|---|
 | 30 | 40 | 282 | (FAIL)

The following problems occurred:

* [30, 40, 282]
```
Condition not satisfied:

ob.numberOfZeros(a,b) == c
|  |             | |  |  |
|  28            | 40 |  282
|                30   false
com.test.t.HW4Solution@8e482c2

```

--------------------------------------------------------------------

### numberOfZeros [1]

Result: **PASS**

* Given: 

```
HW4Solution ob = new HW4Solution()
```

* Expect: 

```
ob.numberOfZeros(a,b) == c
```

* Where: 

 | a | b | c |
 |---|---|---|
 | 50 | 70 | 29 | (PASS)

--------------------------------------------------------------------

### numberOfZeros [2]

Result: **FAILURE**

* Given: 

```
HW4Solution ob = new HW4Solution()
```

* Expect: 

```
ob.numberOfZeros(a,b) == c
```

* Where: 

 | a | b | c |
 |---|---|---|
 | 8 | 50 | 312 | (FAIL)

The following problems occurred:

* [8, 50, 312]
```
Condition not satisfied:

ob.numberOfZeros(a,b) == c
|  |             | |  |  |
|  31            8 50 |  312
|                     false
com.test.t.HW4Solution@39e83c60

```

--------------------------------------------------------------------

### sumOfAllFactors [0]

Result: **PASS**

* Given: 

```
HW4Solution ob = new HW4Solution()
```

* Expect: 

```
ob.sumOfAllFactors(a,b) == c
```

* Where: 

 | a | b | c |
 |---|---|---|
 | 50 | apple | 93 | (PASS)

--------------------------------------------------------------------

### sumOfAllFactors [1]

Result: **PASS**

* Given: 

```
HW4Solution ob = new HW4Solution()
```

* Expect: 

```
ob.sumOfAllFactors(a,b) == c
```

* Where: 

 | a | b | c |
 |---|---|---|
 | 80 | banana | 186 | (PASS)

--------------------------------------------------------------------

### sumOfAllFactors [2]

Result: **PASS**

* Given: 

```
HW4Solution ob = new HW4Solution()
```

* Expect: 

```
ob.sumOfAllFactors(a,b) == c
```

* Where: 

 | a | b | c |
 |---|---|---|
 | 49 | apple | 57 | (PASS)

--------------------------------------------------------------------

### dumpAsBinaryString [0]

Result: **PASS**

* Given: 

```
HW4Solution ob = new HW4Solution()
```

* Expect: 

```
ob.dumpAsBinaryString(a,b) == c
```

* Where: 

 | a | b | c |
 |---|---|---|
 | 10 | 20 | 00000000_00000000_00000000_00001010 | (PASS)

--------------------------------------------------------------------

### dumpAsBinaryString [1]

Result: **PASS**

* Given: 

```
HW4Solution ob = new HW4Solution()
```

* Expect: 

```
ob.dumpAsBinaryString(a,b) == c
```

* Where: 

 | a | b | c |
 |---|---|---|
 | 45 | 60 | 00000000_00000000_00000000_00101101 | (PASS)

--------------------------------------------------------------------

### dumpAsBinaryString [2]

Result: **PASS**

* Given: 

```
HW4Solution ob = new HW4Solution()
```

* Expect: 

```
ob.dumpAsBinaryString(a,b) == c
```

* Where: 

 | a | b | c |
 |---|---|---|
 | 70 | 80 | 00000000_00000000_00000000_01000110 | (PASS)

--------------------------------------------------------------------

