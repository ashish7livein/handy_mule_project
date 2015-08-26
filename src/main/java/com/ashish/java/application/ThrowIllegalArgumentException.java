package com.ashish.java.application;

public class ThrowIllegalArgumentException {

	public static String throwException() {
		throw new IllegalArgumentException("ILLEGAL");
	}
	
	public static void main (String args[]) {
		try {
			throwException();
		}catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			
			System.out.println("CAUGHT");
		}
	}
	
}
