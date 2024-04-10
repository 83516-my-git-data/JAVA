package com.sunbeam.tester;

import java.util.Scanner;
import com.sunbeam.entity.LongString;
import com.sunbeam.exception.ExceptionLineTooLong;
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LongString s = new LongString();
		s.acceptString(sc);
		try {
			s.displayString();
		} catch (ExceptionLineTooLong e) {
			e.printStackTrace();
		}

		sc.close();
	}

}
