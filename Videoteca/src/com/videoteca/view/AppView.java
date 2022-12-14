package com.videoteca.view;

import com.videoteca.controller.VideotecaController;

public class AppView {

	
	
	public static void main(String[] args) 
	{
		
		final int LOGIN = 1;
		final int NEW_ACCOUNT = 2;
		final int LIST_OF_MOVIES = 1;
		final int SUGGESTED_MOVIES = 2;
		final int RENT_A_MOVIE = 3;
		
		int userChoice = 0;
		
		// User
		String name = null;
		String email = null;
		String password = null;
		
		boolean loggedIn = false;
		VideotecaController controller = new VideotecaController();
		
		
		System.out.println("1 - LOGIN");
		System.out.println("2 - NEW ACCOUNT");
		
		if(userChoice == LOGIN)
		{
			// ask for email.
			// ask for password.
			loggedIn = controller.doLogin(email, password);
		
		}else  if(userChoice == NEW_ACCOUNT)
		{
			// ask for name.
			// ask for email.
			// ask for password.
			loggedIn = controller.doNewAccount(name, email, password);
		}

		
		if(loggedIn) 
		{
			// Do things for loggedIn user.
			System.out.println("1 - LIST OF MOVIES");
			System.out.println("2 - SUGGESTED MOVIES");
			System.out.println("3 - RENT A MOVIE");
			
			switch (userChoice) {
				case LIST_OF_MOVIES: 
					controller.showListOfMovies();
				break;
				
				case SUGGESTED_MOVIES: 
					controller.showSuggestedMovies();
				break;
				
				case RENT_A_MOVIE: 
					controller.rentMovie();
				break;
			}
			
		}else {
			System.out.println("User not found!");
			System.exit(0);
		}
		
		
	}
}
