package com.videoteca.controller;

import java.util.ArrayList;
import java.util.List;

import com.videoteca.model.Rental;

public class RentalController {

	private List<Rental> rentedMovies = null;
	
	
	public RentalController() 
	{
		this.rentedMovies = new ArrayList<Rental>();
	}
	
	
	public void newRental(Rental newRentedMovie)
	{
		this.rentedMovies.add(newRentedMovie);
	}

	
	public List<Rental> getLast5MinutesRentedItens()
	{
		List<Rental> last5MinutesRentedItens = new ArrayList<Rental>();
		
		// do filter in rentedMovies to get the last 5 minutes rented itens and then fill the new list.
		
		return last5MinutesRentedItens;
	}
}
