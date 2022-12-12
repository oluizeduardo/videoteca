package com.videoteca.dao.users;

import java.util.ArrayList;
import java.util.List;

import com.videoteca.dao.DAOBase;
import com.videoteca.model.User;

public class UserDAO implements DAOBase<User> {

	private List<User> users = null;
	
	
	public UserDAO() 
	{
		this.loadDefaultUsers();
	}
	
	@Override
	public void save(User newUser) 
	{
		this.users.add(newUser);
	}

	@Override
	public boolean delete(User item) 
	{
		if(users.contains(item))
		{
			this.users.remove(item);
			return true;
		}
		return false;
	}

	@Override
	public boolean update(User item) {
		return false;
	}

	@Override
	public User findById(long idItem) {
		return null;
	}
	
	public User findByEmailAndPassword(String email, String password) 
	{
		// Take a look on the internet about stream filters in Java.
		return null;
	}

	
	private void loadDefaultUsers()
	{
		this.users = new ArrayList<User>();
		
		User user1 = new User("Edgar", "edgar@email.com", "abc123");
		User user2 = new User("Alan", "alan@email.com", "abc123");
		User user3 = new User("Poe", "poe@email.com", "abc123");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
	}
	
}
