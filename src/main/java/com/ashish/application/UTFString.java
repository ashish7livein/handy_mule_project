package com.ashish.application;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;


public class UTFString {

	
	public static void main (String args[]) throws UnsupportedEncodingException {
		String description = "Robert Downey Jr. reprises his role as the world's most famous detective, Sherlock Holmes, and Jude Law returns as his friend and colleague, Dr. John Watson , in \"Sherlock Holmes: A Game of Shadows.\" There is a new criminal mastermind at large�-Professor James Moriarty (Jared Harris)�-";
		String encoder = null;
		
		try {
			encoder = URLEncoder.encode(description, "UTF-8");
			String s = "JenÃ©e LaMarque";
			System.out.println(new String(s.getBytes("ISO-8859-1")));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(encoder);
		String decoder = URLDecoder.decode(encoder);
		System.out.println(decoder);
		
		 String Cdata = "MARIE-HÉLÈNE";
	     // byte sByte[] = Cdata.getBytes("UTF-8"); 
	      //Cdata = new String(sByte,"UTF-8");
	      System.out.println(Cdata);
	}
}
