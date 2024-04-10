package com.sunbeam.entity;

import java.util.Scanner;

import com.sunbeam.exception.ExceptionLineTooLong;

public class LongString extends ExceptionLineTooLong {

	private String opinion;

	public void acceptString(Scanner sc) {
		System.out.print("Write your opinion : ");
		opinion = sc.nextLine();
	}

	public void displayString() throws ExceptionLineTooLong {
		if (opinion.length() > 80)
			throw new ExceptionLineTooLong();
		System.out.println("Opinion : "+opinion);

	}
}
