package com.videoteca.model;

public class Serie extends Stream {

	private int seasons = 0;
	
	public Serie(long id, String title, int seasons) {
		super(id, title);
		this.seasons = seasons;
	}

	public int getSeasons() {
		return seasons;
	}

	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}
	
	
}
