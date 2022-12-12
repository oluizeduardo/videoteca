package com.videoteca.controller;

import java.util.List;

import com.videoteca.dao.movies.MovieDAO;
import com.videoteca.dao.users.UserDAO;
import com.videoteca.model.Rental;
import com.videoteca.model.User;

public class VideotecaController {

	
	private UserDAO userDAO = null;
	
	private MovieDAO movieDAO = null;
	
	private RentalController rentalController = null;
	
	
	
	public VideotecaController() 
	{
		this.userDAO = new UserDAO();
		this.movieDAO = new MovieDAO();
		this.rentalController = new RentalController();
	}
	
	
	public boolean doLogin(String email, String password)
	{
		// Do a filter in your user list to check whether the user exists.
		
		User founduser = this.userDAO.findByEmailAndPassword(email, password);
		
		if(founduser != null)
		{
			return true;
		}
		
		return false;
	}
	
	
	/**
	 * Save the new user and return a boolean indicating the user is already loggedin.
	 */
	public boolean doNewAccount(String name, String email, String password)
	{
		User newuser = new User(name, email, password);
		try 
		{
			this.userDAO.save(newuser);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public void showListOfMovies()
	{
		this.movieDAO
			.getMovies()
			.stream()
			.forEach(movie -> System.out.println(movie));
	}
	
	
	public void showSuggestedMovies()
	{
		List<Rental> last5MinutesRentedItens = rentalController.getLast5MinutesRentedItens();
		
		last5MinutesRentedItens.forEach(rentedItem -> System.out.println(rentedItem.getMovie().toString()));
	}
	
	public void rentMovie()
	{
		Rental newRentedMovie = new Rental();
		rentalController.newRental(newRentedMovie);
	}
	
	
}
