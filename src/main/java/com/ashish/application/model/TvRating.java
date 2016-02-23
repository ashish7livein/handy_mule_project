/*
 * Copyright (c) 2015 EchoStar Technologies L.L.C. 
 * All Rights Reserved
 * Confidential Property of EchoStar Technologies L.L.C.
 *
 * THE MATERIAL CONTAINED HEREIN MAY ONLY BE USED SUBJECT TO AN EXECUTED
 * AGREEMENT BETWEEN THE USER AND ECHOSTAR TECHNOLOGIES L.L.C.
 * DISCLOSURE OF THIS MATERIAL IS STRICTLY PROHIBITED EXCEPT SUBJECT TO
 * THE TERMS OF SUCH AN AGREEMENT.
 */

package com.ashish.application.model;

import org.apache.commons.lang3.StringUtils;

public enum TvRating {
	TV_NR	("NR",		0),
	TV_Y	("TV-Y",	1),
	TV_Y7	("TV-Y7",	2),
	TV_G	("TV-G",	3),
	TV_PG	("TV-PG",	4),
	TV_14	("TV-14",	5),
	TV_MA	("TV-MA",	6);
	
	private final String displayValue;
	private final int index;
	
	private TvRating(String str, int index) {
		this.displayValue = str;
		this.index = index;
	}
	
	public int toIndexInt() {
		return index;
	}

	public String toDisplayValueString() {
		return displayValue;
	}

	/**
	 * Method to return the TV Rating enum representation
	 *
	 * @param tvRatingStr TV rating value string representation
	 * @return The TV Rating enum representation
	 */
	public static TvRating fromPropertyString(String tvRatingStr) {
		TvRating tvRating = null;
		tvRatingStr = StringUtils.strip(tvRatingStr);
		for (TvRating tr: values()) {
			if (tr.toDisplayValueString().equalsIgnoreCase(tvRatingStr)) {
				tvRating = tr;
				break;
			}
		}
		return tvRating;
	}
	
	/**
	 * Method to return the Star Rating enum representation
	 *
	 * @param tvRatingIdx TV rating Index int representation
	 * @return The Star Rating enum representation
	 */
	public static TvRating fromPropertyInt(int tvRatingIdx) {
		TvRating tvRating = null;
		for (TvRating tr: values()) {
			if (tr.index == tvRatingIdx) {
				tvRating = tr;
				break;
			}
		}
		return tvRating;
	}
	
}
