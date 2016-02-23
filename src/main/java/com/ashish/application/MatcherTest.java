package com.ashish.application;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MatcherTest {

	public static void main (String args[]) {
		String dataPkgUrl = "aj20130304092007.ts";
	    Pattern URL_PATTERN_STRIPPING = Pattern.compile("[^/]+");

		Matcher urlMatcher = URL_PATTERN_STRIPPING.matcher(dataPkgUrl);
		System.out.println(urlMatcher.matches());
		String urlFilename = urlMatcher.group();
		
		System.out.println(urlFilename);
		
		Pattern URL_PATTERN = Pattern.compile("(.*)/(.*)$");
		 urlMatcher = URL_PATTERN.matcher(dataPkgUrl);
		 System.out.println(urlMatcher.matches());
		 urlFilename = urlMatcher.group(urlMatcher.groupCount() - 1) + "/" + urlMatcher.group(
	                urlMatcher.groupCount());
		 System.out.println(urlFilename);
		 
		 urlFilename = urlMatcher.group(urlMatcher.groupCount());
		 System.out.println(urlFilename);
	}
}
