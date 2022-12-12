package com.videoteca.model;

public class Movie extends Stream {

	private int durationInMinutes = 0;
	
	
	public Movie(long id, String title, int durationInMinutes) {
		super(id, title);
		this.durationInMinutes = durationInMinutes;
	}


	public int getDurationInMinutes() {
		return durationInMinutes;
	}


	public void setDurationInMinutes(int durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}
	
	
}
