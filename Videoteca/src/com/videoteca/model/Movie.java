package com.videoteca.model;

public class Movie extends Stream {

	private int durationInMinutes = 0;
	
	
	public Movie(long id, String title, double price, int durationInMinutes) {
		super(id, title, price);
		this.durationInMinutes = durationInMinutes;
	}


	public int getDurationInMinutes() {
		return durationInMinutes;
	}


	public void setDurationInMinutes(int durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}

	// Describes a movie object.
	@Override
	public String toString() {
		return "Movie [ID: "+getId()+" Title: "+getTitle()+" Duration:  "+getDurationInMinutes()+" Price: "+getPrice()+"]";
	}
	
	
	
}
