//Q1. Write a java program to reverse a String.

package com.sunbeam.str;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String : ");
		str = sc.nextLine();

		for (int i = str.length() - 1; i > -1; i--)
			System.out.print(str.charAt(i));

		sc.close();
	}

}
