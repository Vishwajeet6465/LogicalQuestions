package com.string.java;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String nstr = "";
		
		for(int i = str.length() - 1; i >= 0; i--) {
			nstr += str.charAt(i);
		}
		
		if(str.equals(nstr)) {
			System.out.println("Given String is a Palindrome.");
			 
		}else {
			System.out.println("Given String is NOT a Palindrome.");
		}
		sc.close();
	}

}
