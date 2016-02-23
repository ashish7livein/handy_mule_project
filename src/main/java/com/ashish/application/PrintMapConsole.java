package com.ashish.application;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.ashish.application.model.MpaaRating;
import com.ashish.application.model.TvRating;

public class PrintMapConsole {
    private static final Map<String, String> tvRatingsExactMatcherMap = new HashMap<String, String>();
    private static final Map<String, String> tvRatingsContainsMap = new HashMap<String, String>();
    private static final Map<String, String> mpaaRatingsExactMatcherMap = new HashMap<String, String>();
    private static final Map<String, String> mpaaRatingsContainsMap = new HashMap<String, String>();

    static {
        tvRatingsExactMatcherMap.put("y", TvRating.TV_Y.toDisplayValueString());
        tvRatingsExactMatcherMap.put("tvy",
                TvRating.TV_Y.toDisplayValueString());
        tvRatingsExactMatcherMap.put("g", TvRating.TV_G.toDisplayValueString());
        tvRatingsExactMatcherMap.put("tvg",
                TvRating.TV_G.toDisplayValueString());
        tvRatingsExactMatcherMap.put("r",
                TvRating.TV_MA.toDisplayValueString());
        tvRatingsExactMatcherMap.put("nc17",
                TvRating.TV_MA.toDisplayValueString());
        
        tvRatingsContainsMap.put("y7", TvRating.TV_Y7.toDisplayValueString());
        tvRatingsContainsMap.put("pg", TvRating.TV_PG.toDisplayValueString());
        tvRatingsContainsMap.put("14", TvRating.TV_14.toDisplayValueString());
        tvRatingsContainsMap.put("ma", TvRating.TV_MA.toDisplayValueString());

        mpaaRatingsExactMatcherMap.put("g", MpaaRating.MPAA_G.toValueString());
        mpaaRatingsExactMatcherMap
                .put("pg", MpaaRating.MPAA_PG.toValueString());
        mpaaRatingsExactMatcherMap.put("pg13",
                MpaaRating.MPAA_PG13.toValueString());
        mpaaRatingsExactMatcherMap.put("r", MpaaRating.MPAA_R.toValueString());
        mpaaRatingsExactMatcherMap.put("nc17",
                MpaaRating.MPAA_NC17.toValueString());
        mpaaRatingsExactMatcherMap.put("y", MpaaRating.MPAA_G.toValueString());
        mpaaRatingsExactMatcherMap
                .put("tvy", MpaaRating.MPAA_G.toValueString());
        mpaaRatingsExactMatcherMap
                .put("tvg", MpaaRating.MPAA_G.toValueString());

        mpaaRatingsContainsMap.put("y7", MpaaRating.MPAA_PG.toValueString());
        mpaaRatingsContainsMap.put("pg", MpaaRating.MPAA_PG.toValueString());
        mpaaRatingsContainsMap.put("14", MpaaRating.MPAA_PG13.toValueString());
        mpaaRatingsContainsMap.put("ma", MpaaRating.MPAA_R.toValueString());
    }
    private static final Map<String, String> tvToMpaaRatingsMap = new HashMap<String, String>();

    static {
        tvToMpaaRatingsMap.put(TvRating.TV_NR.toDisplayValueString(), MpaaRating.MPAA_NOT_RATED.toValueString());
        tvToMpaaRatingsMap.put(TvRating.TV_Y.toDisplayValueString(), MpaaRating.MPAA_G.toValueString());
        tvToMpaaRatingsMap.put(TvRating.TV_Y7.toDisplayValueString(), MpaaRating.MPAA_PG.toValueString());
        tvToMpaaRatingsMap.put(TvRating.TV_G.toDisplayValueString(), MpaaRating.MPAA_G.toValueString());
        tvToMpaaRatingsMap.put(TvRating.TV_PG.toDisplayValueString(), MpaaRating.MPAA_PG.toValueString());
        tvToMpaaRatingsMap.put(TvRating.TV_14.toDisplayValueString(), MpaaRating.MPAA_PG13.toValueString());
        tvToMpaaRatingsMap.put(TvRating.TV_MA.toDisplayValueString(), MpaaRating.MPAA_R.toValueString());
    }
    
    
    public static void main (String args[]) {
        
        for(Map.Entry<String, String> entry : mpaaRatingsExactMatcherMap.entrySet()) {
            System.out.println ("It replaces ratings value: \""+entry.getKey()+"\" with \""+entry.getValue()+"\"");
        }
        
        for(Map.Entry<String, String> entry : mpaaRatingsContainsMap.entrySet()) {
            System.out.println ("It replaces ratings value containing substring: \""+entry.getKey()+"\" with \""+entry.getValue()+"\"");
        }
        
        
        for(Map.Entry<String, String> entry : tvRatingsExactMatcherMap.entrySet()) {
            System.out.println ("It replaces ratings value: \""+entry.getKey()+"\" with \""+entry.getValue()+"\"");
        }
        
        for(Map.Entry<String, String> entry : tvRatingsContainsMap.entrySet()) {
            System.out.println ("It replaces ratings value containing substring: \""+entry.getKey()+"\" with \""+entry.getValue()+"\"");
        }
        
        for(Map.Entry<String, String> entry : tvToMpaaRatingsMap.entrySet()) {
            System.out.println ("tvRating \""+entry.getKey()+"\" is mapped to mpaaRating \""+entry.getValue()+"\"");
        }
    }
}
