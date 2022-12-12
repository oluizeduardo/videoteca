package com.videoteca.model;

import java.time.LocalDateTime;

public class Stream {

	private long id;
	
	private String title;
	
	private LocalDateTime createdAt;
	
	private double price;

	
	public Stream(long id, String title, double price) {
		this.id = id;
		this.title = title;
		this.price = price;
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
	
	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}
}
