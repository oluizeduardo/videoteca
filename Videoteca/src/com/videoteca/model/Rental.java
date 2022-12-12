package com.videoteca.model;

import java.time.LocalDateTime;

public class Rental {

	private long id;
	
	private User user;
	
	private Movie movie;
	
	private LocalDateTime checkoutDateTime;
	
	private LocalDateTime checkinDateTime;
	
	private double price;
	
	
	
	public Rental() {
		this.checkoutDateTime = LocalDateTime.now();
	}
	

	public Rental(long id, User user, Movie movie, LocalDateTime checkinDateTime, double price) {
		this.id = id;
		this.user = user;
		this.movie = movie;
		this.checkoutDateTime = LocalDateTime.now();
		this.checkinDateTime = checkinDateTime;
		this.price = price;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public LocalDateTime getCheckoutDateTime() {
		return checkoutDateTime;
	}

	public LocalDateTime getCheckinDateTime() {
		return checkinDateTime;
	}

	public void setCheckinDateTime(LocalDateTime checkinDateTime) {
		this.checkinDateTime = checkinDateTime;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
