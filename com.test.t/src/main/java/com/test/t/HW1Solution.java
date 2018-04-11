package com.test.t;

import java.util.Scanner;

import com.test.t.Grade.Type;

import static java.lang.System.out;

public class HW1Solution {

	/**
	 * count the number of all factors k of a number n which are located in an
	 * interval [s,e]. For example, if n is 100 and [s,e] = [10,30], then the
	 * output should be 3 since there are 3 numbers: 10, 20, 25 which are
	 * located in [10,30] and are factors of 100.
	 * 
	 * 
	 * @param n
	 *            a positive integer
	 * @param s
	 *            a non-negative integer
	 * @param e
	 *            a non-negative integer >= s.
	 * @return the number of factors of n located in [s,e].
	 */
	@Grade(value = 5, type = Type.DIFFICULT)
	@Validate(number = 3, ex = { @Ex(dataInt = { 10, 20, 20 }),
			@Ex(dataInt = { 45, 60, 20 }), @Ex(dataInt = { 70, 80, 20 }) })
	public static int numOfFactors(int n, int s, int e) {
		// TO-DO: place your code here!
		// return -1;

		int rlt = 0;
		for (int k = s; k <= e; k++) {
			if (n % k == 0)
				rlt++;
		}

		return rlt;

	}

	/**
	 * return the reversal of an int number. Ex: if n = 230400, then the result
	 * should be 4032 instead of 004032 (Leading 0's should be stripped). Note:
	 * You cannot use array in the implementation.
	 * 
	 * @param n
	 *            a positive int number
	 * @return the reversal of n.
	 */
	@Grade(value = 7, type = Type.DIFFICULT)
	@Validate(number = 3, ex = { @Ex(dataInt = { 10 }),
			@Ex(dataInt = { 45 }), @Ex(dataInt = { 70 }) })
	public static int reverse(int n) {
		// TO-DO: put your code here!
		// return 0 ;
		int rlt = 0;
		while (n > 0) {
			int rem = n % 10;
			rlt = rlt * 10 + rem;
			n = n / 10;
		}
		return rlt;

	}

	/**
	 * A integer number is called an Armstrong number if it is equal to the sum
	 * of the cubes of each digits of its decimal representation. For example,
	 * 153 is an Armstrong number since 153 = 1*1*1 + 5*5*5 + 3*3*3. Given a
	 * positive integer n, determine if it is an Armstrong number.
	 * 
	 * @param n
	 * @return true iff n is an Armstrong number.
	 */
	@Grade(value = 2, type = Type.DIFFICULT)
	@Validate(number = 3, ex = { @Ex(dataInt = { 20 }),
			@Ex(dataInt = { 60 }), @Ex(dataInt = { 80 }) })
	public static boolean isArmstrongNumber(int n) {
		// TO-DO:put your code here!
		// return false;
		int m = n;
		int rlt = 0;
		while (m > 0) {
			int rem = m % 10;
			rlt += rem * rem * rem;
			if (rlt > n)
				return false;
			m = m / 10;
		}
		return rlt == n;

	}

	/**
	 * Find all Armstrong numbers among the interval [start, end]. The return
	 * String is the concatenation of all Armstrong numbers found in ascending
	 * order with adjacent numbers separated by the comma ',' character. For
	 * example, if the found numbers are 153, 631, 432, then the returned string
	 * should be "153,432,631".
	 * 
	 * @param start
	 * @param end
	 * @return a string
	 */
	@Grade(value = 2, type = Type.DIFFICULT)
	@Validate(number = 3, ex = { @Ex(dataInt = { 200 ,400}),
			@Ex(dataInt = { 100 , 999}), @Ex(dataInt = { 80 ,35}) })
	public static String findAllArmstrongNumbers(int start, int end) {
		// TO-DO: Put your code here!
		// You can call the method isAmstrongNumber(.) in the body
		// return "";
		String rlt = "";

		for (int k = start; k <= end; k++) {
			if (isArmstrongNumber(k)) {
				rlt = rlt.isEmpty() ? rlt + k : rlt + "," + k;
			}
		}

		return rlt;

	}

	
	/**
	 * The integration of a function f(x) from value s to value e can be
	 * approximated by the summation of K sample values of f: S = [f(s) + f(s+d)
	 * + f(s+2d)+ ... f(s+(K-1)d)] * d, where d = (e - s) / (K-1). This problem
	 * requires you to implement the approximation of the integration of the
	 * function f(x) = x*x , with start value s, end value e and number of
	 * samples n given as input parameters.
	 * 
	 * @param start
	 *            the starting value from which to integrate.
	 * @param end
	 *            the end value of the integration.
	 * @param nSamples
	 *            the number of samples is a positive integer.
	 * @return the result of the integration.
	 */
	

	@Grade(value = 2, type = Type.DIFFICULT)
	@Validate(number = 3, ex = { @Ex(dataDou = { 20,35}, dataInt = {10}),
			@Ex(dataDou = { 60 ,35}, dataInt = {10}), @Ex(dataDou = { 80 ,35}, dataInt = {10}) })
	public static double integrationOfSquare(double start, double end,
			int nSamples) {
		// TO-DO: put your code here!
		// return 0.0;
		double sum = 0;
		final double d = (end - start) / (nSamples - 1);
		double x = start;
		for (int i = 0; i < nSamples; i++) {
			sum += x * x;
			x += d;
		}
		return sum * d;

	}
	

	/**
	 * Count the number of bit 1s occurring in the 2's complement representation
	 * of a given int number. Ex: numberOfBit1(12575) =numberOfBits1(0x0000311F)
	 * == 8, while numberOfBit1(-1) = numberOfBit1(0xFFFFFFFF) = 32. while
	 * numberOfBit1(0x80_00_00_00) = 1.
	 * 
	 * @param n
	 *            an int number
	 * @return the number of bit 1s occurring in the 2's complement
	 *         representation of n.
	 */
	@Grade(value = 9, type = Type.HARD)
	@Validate(number = 3, ex = { @Ex(dataInt = { 20}),
			@Ex(dataInt = { 60}), @Ex(dataInt = { 80}) })
	public static int numberOfBitOne(int n) {
		// put your code here!
		// return -1;
		int rlt = 0;
		for (int k = 0; k < 32; k++) {
			if (n % 2 != 0)
				rlt++;
			n >>>= 1;
		}
		return rlt;

	}

	
	
	/**
	 * Count the number of bit changes (from 1 to 0 or from 0 to 1) occurring in
	 * the 2's complement representation of a given int number. Ex:
	 * numOfBitChanges(12575) =numOfBitChanges(0x0000311F) == 5,
	 * numOfBitChanges(-1) = numOfBitChanges(0xFFFFFFFF) = 0, and
	 * numOfBitChanges(1) = numOfBitChanges(0x00000001) = 1.
	 * 
	 * 
	 * @param n
	 *            an int number
	 * @return the number of occurrences of bit changes in the 2's complement
	 *         representation of n.
	 */
	@Grade(value = 4, type = Type.EASY)
	@Validate(number = 3, ex = { @Ex(dataInt = { 20}),
			@Ex(dataInt = { 35}), @Ex(dataInt = { 8}) })
	public static int numberOfBitChanges(int n) {
		// put your code here!
		// return - 1;

		int rlt = 0;
		boolean bit0 = (n % 2 != 0);

		for (int k = 0; k < 31; k++) {
			n >>>= 1;
			boolean bit1 = (n % 2 != 0);
			if (bit0 ^ bit1) {
				rlt++;
				bit0 = bit1;
			}

		}
		return rlt;

	}

	
	
	/**
	 * Find the maximum value among a number of integers entered by the user
	 * from the console.
	 * 
	 * <ol>
	 * Tasks to be done:
	 * <li>Generate a Scanner using System.in.
	 * <li>Input a number of integers from the console using the generated
	 * Scanner until a negative value is entered by the user. Remember to print
	 * out the question:
	 * "Please enter next number: (enter a negative integer to end!):" before
	 * accepting a value from the user.
	 * <li>return the maximum value among all integers entered by the user.
	 * </ol>
	 * 
	 * @return the maximum value entered by the user.
	 */
	/*
	 * 
	@Grade(value = 5, type = Type.EASY)
	@Validate(number = 3, ex = { @Ex(dataInt = {}),
			@Ex(dataInt = {}), @Ex(dataInt = {}) })
	public static int max() {
		// TO-DO: Your code should look like following code:
		Scanner scanner = new Scanner(System.in);

		int rlt = 0;

		System.out
				.println("Please enter next number: (enter a negative int to end!) ");

		// ...
		// return rlt;

		int n = scanner.nextInt();
		while (n >= 0) {
			if (rlt < n)
				rlt = n;
			System.out
					.println("Please enter next number: (enter a negative int to end!) ");
			n = scanner.nextInt();
		}

		return rlt;

	}
	
	*/

	/**
	 * Given a number n between 2 to 9, return a string s which, when printed
	 * out in case of n = 5, would look like a diamond as shown below: *
	 * 
	 * <pre>
	 * 
	 * ----5---- 
	 * ---444---
	 * --33333--
	 * -2222222-
	 * 111111111
	 * -2222222-
	 * --33333--
	 * ---444---
	 * ----5----
	 * </pre>
	 * 
	 * Notes: 1. the last line must end with "\n". 2. You may use the provided
	 * method nch(ch, n).
	 * 
	 * @param n
	 *            the number parameter of the diamond.
	 */
	
	@Grade(value = 5, type = Type.EASY)
	@Validate(number = 3, ex = { @Ex(dataInt = {4}),
			@Ex(dataInt = {3}), @Ex(dataInt = {6}) })
	
	public static String diamond(int n) {
		// place your code here!
		// return "XXXX";
		
		String rlt = "" ;
		
		for(int k = n, t =1; k> 0; k--, t += 2) {
			rlt += nch('-', k-1) + nch((char)('0'+k), t) + nch('-', k-1)+"\n"; 
		}
		
		for(int k = 2, t = n*2 - 3 ; k <= n; k++, t -= 2) {
			rlt += nch('-', k-1) + nch((char)('0'+k), t) + nch('-', k-1)+"\n"; //
		}
		
		return rlt;
	}
	
	

	/**
	 * Return a string consisting of n character c's.
	 * 
	 * @param c
	 * @param n
	 *            >= 0 is an integer.
	 * @return
	 */
	private static String nch(char c, int n) {
		String rlt = "";
		for (int k = 0; k < n; k++) {
			rlt += c;
		}
		return rlt;
	}

}
