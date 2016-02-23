package com.ashish.application;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.ashish.application.model.MpaaRating;
import com.ashish.application.model.TvRating;


public class RatingRegexModifier {
    
    
    private final static Logger LOGGER = Logger.getLogger(RatingRegexModifier.class);

    
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
    
    
    public static void main (String[] args) {
        String originalRatingStr;
        
        String[] tvRatings = {"y","tvy","g", "tvg","y7","pg","14","ma"," ","", "vfg", null, "tv_g"};
        
        String[] mpaaRatings = {"g","pg","pg 13", "r", "nc17","y", "tvy", "tvg", "y7", "p g", "14", "ma", "", null, "req"};
        
        String contentType = "tv";
        
        
        for (int i=0; i<mpaaRatings.length; i++){
            String normalizedRatingStr = null;
            originalRatingStr = mpaaRatings[i];
            LOGGER.info("originalRating: "+ originalRatingStr);
            String modifiedRatingStr = convertToLowerCaseTrimAndRemoveSpecialCharacters(originalRatingStr);
             
            if (StringUtils.equalsIgnoreCase(contentType, "movie")) {
                normalizedRatingStr = extractNormalizedRatings(
                        modifiedRatingStr, mpaaRatingsExactMatcherMap,
                        mpaaRatingsContainsMap);
                if (normalizedRatingStr == null) {
                    normalizedRatingStr = MpaaRating.MPAA_NR_AO.toValueString();
                }
            } else if (StringUtils.equalsIgnoreCase(contentType, "adult")) {
                normalizedRatingStr = MpaaRating.MPAA_NR_AO.toValueString();
            } else {
                normalizedRatingStr = extractNormalizedRatings(
                        modifiedRatingStr, tvRatingsExactMatcherMap,
                        tvRatingsContainsMap);
                if (normalizedRatingStr == null) {
                    normalizedRatingStr = TvRating.TV_NR.toDisplayValueString();
                }
            }
            LOGGER.info("normalizedRating: "+ normalizedRatingStr +"\n");
        }
        
        
    }

    private static String extractNormalizedRatings(String modifiedRatingStr,
            Map<String, String> exactMatcherMap, Map<String, String> contiansMap) {
        String normalizedRatingStr = null;
        normalizedRatingStr = exactMatcherMap.get(modifiedRatingStr);
        if (normalizedRatingStr == null) {
            for (Map.Entry<String, String> entry : contiansMap.entrySet()) {
                if (StringUtils.contains(modifiedRatingStr, entry.getKey())) {
                    normalizedRatingStr = entry.getValue();
                    break;
                }
            }
            
        }
        return normalizedRatingStr;
    }

    private static String convertToLowerCaseTrimAndRemoveSpecialCharacters(
            String originalRatingStr) {
        String modifiedRatingString = "";
        if (originalRatingStr!=null) {
            modifiedRatingString = originalRatingStr.replaceAll(" ", "");
            modifiedRatingString = modifiedRatingString.replaceAll(
                    "[\\-\\_\\+\\.\\^:,]", "");
            return modifiedRatingString.toLowerCase();
        } 
        
        return modifiedRatingString;
        
    }

}
