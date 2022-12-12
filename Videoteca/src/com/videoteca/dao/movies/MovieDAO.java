package com.videoteca.dao.movies;

import java.util.List;

import com.videoteca.dao.CSVFileDAO;
import com.videoteca.dao.DAOBase;
import com.videoteca.model.Movie;

public class MovieDAO implements DAOBase<Movie> {

	
	private static final String MOVIES_DATASET_FILE_PATH = "C:/...";
	
	private CSVFileDAO csvFileDAO = null;
	
	private List<Movie> movies = null;
	
	
	public MovieDAO() {
		this.csvFileDAO = new CSVFileDAO(MOVIES_DATASET_FILE_PATH);
		this.movies = csvFileDAO.loadFile();
	}


	@Override
	public void save(Movie newItem) 
	{
		if (newItem != null) 
		{
			this.movies.add(newItem);
		}
	}


	@Override
	public boolean delete(Movie item) 
	{
		if(movies.contains(item))
		{
			this.movies.remove(item);
			return true;
		}
		
		return false;
	}


	@Override
	public boolean update(Movie item) 
	{
		if(movies.contains(item))
		{
			int index = movies.indexOf(item);
			Movie movie = movies.get(index);
			
			movie.setId(item.getId());
			movie.setTitle(item.getTitle());
			movie.setDurationInMinutes(item.getDurationInMinutes());
			
			return true;
		}
		return false;
	}


	@Override
	public Movie findById(long id)
	{
		return null;
	}


}
