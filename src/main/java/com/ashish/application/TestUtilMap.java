package com.ashish.application;
import java.util.HashMap;
import java.util.Map;


public class TestUtilMap {

	public static void main (String args[]) {
		Map<String, String> test = new HashMap<String, String>();
		test.put("a1", "b1");
		test.put("a2", "b2");
		System.out.println(test.toString());
 	}
}
