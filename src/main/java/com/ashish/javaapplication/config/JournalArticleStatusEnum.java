package com.ashish.javaapplication.config;
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


 	 	 
 	 	public enum JournalArticleStatusEnum {
 	 	        STATUS_ANY(-1),
 	 	        STATUS_APPROVED(0),
 	 	        STATUS_DENIED(4),
 	 	        STATUS_DRAFT(2),
 	 	        STATUS_EXPIRED(3),
 	 	        STATUS_INACTIVE(5),
 	 	        STATUS_INCOMPLETE(6),
 	 	        STATUS_PENDING(1);
 	 	        
 	 	        
 	 	        int status;
 	 	 
 	 	        private JournalArticleStatusEnum(int status) {
 	 	                this.status = status;
 	 	        }
 	 	 
 	 	        public int getStatus() {
 	 	                return status;
 	 	        }
 	 	        
 	 	        public static JournalArticleStatusEnum getJournalArticleStatusEnum(int status) {
 	 	                for (JournalArticleStatusEnum journalArticleStatusEnum : values()) {
 	 	                        if (journalArticleStatusEnum.getStatus() == status) {
 	 	                                return journalArticleStatusEnum;
 	 	                        }
 	 	                }
 	 	                throw new IllegalArgumentException();
 	 	        }
 	 	        
 	 	}
 	 	 