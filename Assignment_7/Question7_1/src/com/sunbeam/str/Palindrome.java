// Q2. Write a java code to check string is palindrome.

package com.sunbeam.str;

public class Palindrome {

	private String str = "abbba";
	private String str1;

	public void process() {
		for(int i=str.length()-1; i>-1; i--) {
			 str1 = str1+str.charAt(i);
		}		
	}

	public void findPalindrome() {
		if(str1.equals(str))
			System.out.println("String is NOT palindrome : "+str);
		else
			System.out.println("String is palindrome : "+str);

	}

	public static void main(String[] args) {

		Palindrome p = new Palindrome();
		p.process();
		p.findPalindrome();
	}

}
