package com.string.java;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	public static boolean isAnagram(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		
		char[] arr1 = str1.toLowerCase().toCharArray();
		char[] arr2 = str2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("****** Program to check Strings are anagram or not ******");
		System.out.println("Enter String 1(Press ENTER for next string): ");
		String s1 = sc.next();
		String s2 = sc.next();
		
		if(isAnagram(s1,s2)) {
			System.out.println("Given Two Strings ara Anagram to each other");
		}else {
			System.out.println("Given Two Strings NOT Anagram to each other");
		}
		sc.close();
	}
}
