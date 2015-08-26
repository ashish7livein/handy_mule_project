package com.ashish.javaapplication;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;


public class UTFString {

	
	public static void main (String args[]) {
		String description = "Robert Downey Jr. reprises his role as the world's most famous detective, Sherlock Holmes, and Jude Law returns as his friend and colleague, Dr. John Watson , in \"Sherlock Holmes: A Game of Shadows.\" There is a new criminal mastermind at large�-Professor James Moriarty (Jared Harris)�-";
		String encoder = null;
		try {
			encoder = URLEncoder.encode(description, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(encoder);
		String decoder = URLDecoder.decode(encoder);
		System.out.println(decoder);
	}
}
