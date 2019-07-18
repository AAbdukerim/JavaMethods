package com.Vytrach.utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyMethods {
	public static void main(String[] args) {

		int[] nums = { 12, 32, 56, 78, 90, 12, 42, 3 };
		MyMethods.FindBigNum(nums);
		MyMethods.FindSmallestNum(nums);

		String[] strArr = { "Alma", "Neshput", "neshput", "alma", "uzum", "alma" };
		MyMethods.printUniqueElements(strArr);
		MyMethods.plus(12, 23);
		MyMethods.plus(23, 54);
		MyMethods.plus(12, 12, 32);

		boolean bol = IssameWord("Alma", "alma");
		System.out.println(bol);
		
		System.out.println("Sum of array :"+ SumofIntArray(nums));

	}

	public static void ReverseString(String word) {
		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.println(word.charAt(i));
		}
	}

	public static String ReverseString1(String word) {
		String store = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			store += word.charAt(i);
		}
		return store;
	}

	public static void FindBigNum(int[] nums) {
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > temp) {
				temp = nums[i];

			}
		}
		System.out.println("The Biggest Number:" + temp);
	}

	public static void FindSmallestNum(int[] nums) {
		int temp = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < temp) {
				temp = nums[i];

			}
		}
		System.out.println("The Smallest Number: " + temp);
	}

	public static void printUniqueElements(String[] strArr) {

		List<String> str = new ArrayList<String>(Arrays.asList(strArr));
		Set<String> strSet = new HashSet<String>(str);
		System.out.println(strSet.toString());
	}

	public static void plus(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}

	public static void plus(int num1, int num2, int num3) {
		int result = num1 + num2 + num3;
		System.out.println(result);
	}
	/*
	 * Create a method which compares two String value and returns a boolean if two
	 * String are same , print true and if not , print false
	 */

	public static boolean IssameWord(String word1, String word2) {

		if (word1.equals(word2)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean IssameNum(int num1,int num2) {
		if (num1 == num2) {
			return true;
			}else {
				return false;
			}
	}
	/* create a method which prints the sum of int values in an array;
	 */
	public static int SumofIntArray(int[] nums) {
		
		int temp =0;
		
		for (int i = 0; i < nums.length; i++) {
				temp = temp + nums[i];
		}
		return temp;

			}
		
		}
	

