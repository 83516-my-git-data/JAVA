// Q3. write a java program to count number of words in a String.
//     Hint: You can use , trim() , length() and split() methods

package com.sunbeam.str;

import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str;
		int count = 0;
		System.out.print("Enter a message : ");
		str = sc.nextLine();

		String arr[] = str.split(" ");
		for (@SuppressWarnings("unused") String element : arr)
			++count;

		System.out.println("Number of words in a string : " + count);

		sc.close();
	}

}
