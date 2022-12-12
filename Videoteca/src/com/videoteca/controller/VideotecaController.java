package com.videoteca.controller;

import com.videoteca.dao.users.UserDAO;
import com.videoteca.model.User;

public class VideotecaController {

	
	private UserDAO userDAO = null;
	
	
	
	public VideotecaController() 
	{
		this.userDAO = new UserDAO();
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
	
}
