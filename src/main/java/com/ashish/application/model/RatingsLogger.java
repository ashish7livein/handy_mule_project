package com.ashish.application.model;

import com.echostar.model.vodAssets.jaxb.CriticSummary;
import com.echostar.model.vodAssets.jaxb.FanSummary;

public class RatingsLogger {
	
	private String assetId;
	private String metaProvider;
	private CriticSummary criticSummary;
	private FanSummary fanSummary;
	private ReviewsLogger reviews;
	
	
	public String getAssetId() {
		return assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}
	public String getMetaProvider() {
		return metaProvider;
	}
	public void setMetaProvider(String metaProvider) {
		this.metaProvider = metaProvider;
	}
	public CriticSummary getCriticSummary() {
		return criticSummary;
	}
	public void setCriticSummary(CriticSummary criticSummary) {
		this.criticSummary = criticSummary;
	}
	public FanSummary getFanSummary() {
		return fanSummary;
	}
	public void setFanSummary(FanSummary fanSummary) {
		this.fanSummary = fanSummary;
	}
	public ReviewsLogger getReviews() {
		return reviews;
	}
	public void setReviews(ReviewsLogger reviews) {
		this.reviews = reviews;
	}
	 
	 
	 
	 
}
