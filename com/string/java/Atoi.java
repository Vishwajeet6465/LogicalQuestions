package com.string.java;

import java.util.Scanner;

public class Atoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int result = Conversion(str);
		System.out.println(result);
		
		sc.close();
	}
	
	public static int Conversion(String s) {
		int flag = 1;
		int i = 0;
		long ans = 0;
		
		while(s.charAt(i) == '0') {
			i++;
		}
		
		if(s.charAt(i) == '-') {
			flag = -1;
			i++;
		}
		
		while(i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
			ans = ans * 10 + (s.charAt(i) - '0');
			i++;
		}
		
		return (int) (flag * ans);
	}
}
