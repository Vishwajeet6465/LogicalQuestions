package com.string.java;

import java.util.Scanner;

public class ValidPalindrome {
	public static void main(String[] args) {
		System.out.println("Enter a sentence to check whether it is palindrome or not: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		boolean result = checkPalindrome(str);
		if(result) {
			System.out.println("Palindrome");			
		}else {
			System.out.println("NOT Palindrome");
		}
		
		sc.close();

	}

	private static boolean checkPalindrome(String str) {
//		str = str.trim();
		String nstr = "";
		String reversed = "";
		boolean flag = false;
		
		for(int i = 0; i < str.length(); i++) {
			if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
				nstr += str.charAt(i);
			}
		}
		
		nstr = nstr.toLowerCase();
		System.out.println(nstr);
		
		for(int j = nstr.length() - 1; j >= 0; j--) {
			reversed += nstr.charAt(j);
		}
		
		reversed = reversed.toLowerCase();
		System.out.println(reversed);
		
		if(nstr.equals(reversed)) {
			flag = true;
		}
		return flag;
	}
}
