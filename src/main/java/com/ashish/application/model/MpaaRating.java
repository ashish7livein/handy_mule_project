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

public enum MpaaRating {
	MPAA_NR_AO		("NR/AO",	0),
	MPAA_G			("G",		1),
	MPAA_PG			("PG",		2),
	MPAA_PG13		("PG-13",	3),
	MPAA_R			("R",		4),
	MPAA_NC17		("NC-17",	5),
	MPAA_NOT_RATED	("HAS NOT BEEN RATED", 6);
	
	private final String value;
	private final int index;
	
	private MpaaRating(String value, int index) {
		this.value = value;
		this.index = index;
	}
	public int getIndexInt() {
		return index;
	}
	
	public String toValueString() {
		return value;
	}
	
	/**
	 * Method to return the MPAA rating enum representation
	 *
	 * @param mpaaRatingStr MPAA rating string representation
	 * @return The MPAA rating enum representation
	 */
	public static MpaaRating fromPropertyString(String mpaaRatingStr) {
		MpaaRating mpaaRating = null;
		mpaaRatingStr = StringUtils.strip(mpaaRatingStr);
		for (MpaaRating mr: values()) {
			if (mr.toValueString().equalsIgnoreCase(mpaaRatingStr)) {
				mpaaRating = mr;
				break;
			}
		}
		return mpaaRating;
	}
	
	/**
	 * Method to return the MPAA Rating enum representation
	 *
	 * @param input MPAA rating Index int representation
	 * @return The MPAA rating enum representation
	 */
	public static MpaaRating fromPropertyInt(int mpaaRatingIdx) {
		MpaaRating mpaaRating = null;
		for (MpaaRating mr: values()) {
			if (mr.getIndexInt() == mpaaRatingIdx) {
				mpaaRating = mr;
				break;
			}
		}
		return mpaaRating;
	}
	
}