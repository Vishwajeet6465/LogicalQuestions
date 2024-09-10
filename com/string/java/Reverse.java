package com.string.java;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		System.out.println("Program to Reverse String");
		System.out.println("Enter String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String nstr = "";
		
		for(int i = str.length() - 1; i >= 0; i--) {
			nstr += str.charAt(i);
		}
		
		System.out.println("Reversed String is: "+ nstr);
		sc.close();
	}

}
