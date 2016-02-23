package com.ashish.application;

import java.util.HashMap;

public class StringSplit_Poster {

	public static void main (String args[]) {
		String posterPath = "/artwork/panam_english.com/E75JV_148x222_pos.png";
		String[] posterPathSplit = posterPath.split("/");
		System.out.println(posterPathSplit[posterPathSplit.length-1]);
		
		String spaceString = "do as I say not as I do";
		HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
		//split str into an array of words(separated by whitespace)
		String[] words = spaceString.split(" ");
		//iterate through array increasing occurrence by one if map already contains the word
		for (int i = 0; i < words.length; i++)
		{
			if(wordCountMap.containsKey(words[i]))
			{
				wordCountMap.put(words[i], wordCountMap.get(words[i]) + 1);
			}
			else {
				wordCountMap.put(words[i], 1);
			}
		}
		//iterate through map printing out each word and amount of occurrences
		for(String word  : wordCountMap.keySet())
		{
			System.out.println(word + ":" + wordCountMap.get(word));
		}

	}
}
