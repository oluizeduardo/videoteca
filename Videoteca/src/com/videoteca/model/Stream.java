package com.videoteca.model;

import java.time.LocalDateTime;

public class Stream {

	private long id;
	
	private String title;
	
	private LocalDateTime createdAt;

	
	public Stream(long id, String title) {
		this.id = id;
		this.title = title;
		this.createdAt = LocalDateTime.now();
	}
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
}
