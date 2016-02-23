package com.ashish.application;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.ashish.application.model.TvRating;


public class RegexTry {

    private static final Map<String, String> tvRatingsMatcherMap = new HashMap<String, String>();
    private static final Map<String, String> tvRatingsContainsMap = new HashMap<String, String>();
    
    
    static {
        tvRatingsMatcherMap.put("y", TvRating.TV_Y.toDisplayValueString());
        tvRatingsMatcherMap.put("tvy", TvRating.TV_Y.toDisplayValueString());
        tvRatingsMatcherMap.put("g", TvRating.TV_G.toDisplayValueString());
        tvRatingsMatcherMap.put("tvg", TvRating.TV_G.toDisplayValueString());
        
        tvRatingsContainsMap.put("y7", TvRating.TV_Y7.toDisplayValueString());
        tvRatingsContainsMap.put("pg", TvRating.TV_PG.toDisplayValueString());
        tvRatingsContainsMap.put("14", TvRating.TV_14.toDisplayValueString());
        tvRatingsContainsMap.put("ma", TvRating.TV_MA.toDisplayValueString());
    }
    
    
    public static void main (String args[]) {
        String original = " pg,w ";
        original = convertToLowerCaseTrimAndRemoveSpecialCharacters(original);
        System.out.println(original);
        String normalized = tvRatingsMatcherMap.get(original);
        if (normalized==null) {
            for (Map.Entry<String, String> entry : tvRatingsContainsMap.entrySet()) {
                
                if (StringUtils.contains(original, entry.getKey())) {
                    normalized = entry.getValue();
                    break;
                }
            }
            if (normalized==null) {
                normalized = TvRating.TV_NR.toDisplayValueString();
            }
        }
        
            
        System.out.println(normalized);
    }
    
    private static String convertToLowerCaseTrimAndRemoveSpecialCharacters(String originalRatingStr) {
        String modifiedRatingString = originalRatingStr.trim();
        modifiedRatingString = modifiedRatingString.replaceAll("[\\-\\+\\.\\^:,]","");
        return modifiedRatingString.toLowerCase();
    }
}
