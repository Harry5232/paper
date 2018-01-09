package com.test.t;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.test.t.Grade.Type;

public class HW4Solution {
	@Grade(value = 5, type = Type.HARD)
	@Validate(number = 3, ex = {
			@Ex(dataInt = { 50 }, dataString = { "apple" }),
			@Ex(dataInt = { 80 }, dataString = { "banana" }) })
	public static int sumOfAllFactors(int n, String s) {
		// place your code here!
		int sum = 0;
		for (int k = 1; k <= n; k++) {
			if (n % k == 0) {
				sum += k;
			}
		}
		return sum;

	}

	@Grade(value = 2, type = Type.DIFFICULT)
	@Validate(number = 3, ex = { @Ex(dataInt = { 10, 20 }),
			@Ex(dataInt = { 45, 60 }), @Ex(dataInt = { 70, 80 }) })
	public static String dumpAsBinaryString(int k, int t) {
		// place your code here!
		String rlt = "";

		int maskBits = 0x80000000;
		for (int bytes = 3; bytes >= 0; bytes--) {
			for (int bits = 7; bits >= 0; bits--) {
				if ((k & maskBits) == 0)
					rlt += "0";
				else
					rlt += "1";
				maskBits >>>= 1;

			}
			if (bytes > 0)
				rlt += "_";
		}
		return rlt;
	}

	@Grade(value = 8)
	@Validate(number = 3, ex = { @Ex(dataInt = { 1, 10, 5 }) })
	public static float bits2Float(int sign, int exp, int mantissa) {

		int signBit = sign == 1 ? 0 : 1;

		int bits = (signBit << 31) | (exp << 23) | mantissa;

		// the method intBitsToFloat in class Float can be used get the float
		// value which has the same bits
		// content as a given int value.
		return Float.intBitsToFloat(bits);

	}

	@Grade(value = 6	, type = Type.EASY)
	@Validate(number = 3, ex = { @Ex(dataInt = { 30, 40 }),
			@Ex(dataInt = { 50, 70 }) })
	public static int numberOfZeros(int n, int t) {
		int nZeros = 0;
		int maskBits = 0x00000001;
		for (int k = 0; k < 32; k++) {
			if ((n & maskBits) == 0)
				nZeros++;
			maskBits <<= 1;
		}
		return nZeros;

	}

}