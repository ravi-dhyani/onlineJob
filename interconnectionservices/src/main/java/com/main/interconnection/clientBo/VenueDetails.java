package com.main.interconnection.clientBo;

import java.math.BigDecimal;

import com.main.interconnection.solr.response.venue.Response;
import com.main.interconnection.solr.response.venue.ResponseHeader;

public class VenueDetails {
	
	public ResponseHeader responseHeader;

	
	  public int numFound;
	  public Venue venue;
	  private String isBookMark;
	  private String isflag;
	  private double Rating;
	  private double AverageRating;
	  private String deals;
	  private int totalReview;
	  private int totalImage;
	  
		public String getDeals() {
		return deals;
	}
	public void setDeals(String deals) {
		this.deals = deals;
	}
		public int getNumFound() {
			return numFound;
		}
		public void setNumFound(int numFound) {
			this.numFound = numFound;
		}
		public Venue getVenue() {
			return venue;
		}
		public void setVenue(Venue venue) {
			this.venue = venue;
		}
		public String getIsBookMark() {
			return isBookMark;
		}
		public void setIsBookMark(String isBookMark) {
			this.isBookMark = isBookMark;
		}
		public String getIsflag() {
			return isflag;
		}
		public void setIsflag(String isflag) {
			this.isflag = isflag;
		}
		public ResponseHeader getResponseHeader() {
			return responseHeader;
		}
		public void setResponseHeader(ResponseHeader responseHeader) {
			this.responseHeader = responseHeader;
		}
		public double getRating() {
			return Rating;
		}
		public void setRating(double rating) {
			Rating = rating;
		}
		public double getAverageRating() {
			return AverageRating;
		}
		public void setAverageRating(double averageRating) {
			AverageRating = averageRating;
		}
		public int getTotalReview() {
			return totalReview;
		}
		public void setTotalReview(int totalReview) {
			this.totalReview = totalReview;
		}
		public int getTotalImage() {
			return totalImage;
		}
		public void setTotalImage(int totalImage) {
			this.totalImage = totalImage;
		}
	
}
