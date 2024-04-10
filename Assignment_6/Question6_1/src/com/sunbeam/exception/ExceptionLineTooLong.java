package com.sunbeam.exception;

import java.util.Scanner;

public class ExceptionLineTooLong extends Exception
{
	private String message;
	
	public ExceptionLineTooLong() {
		message = "The string is too long";
	}
	
	@Override
	public void printStackTrace() {
		System.err.println("Exception ");
		System.err.println("ExceptionLineTooLong : "+message);
	
	}
		
}



