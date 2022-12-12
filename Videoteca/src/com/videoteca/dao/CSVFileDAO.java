package com.videoteca.dao;

import java.util.ArrayList;
import java.util.List;

import com.videoteca.model.Movie;

public class CSVFileDAO {

	
	private String filePath = null;
	
	
	public CSVFileDAO(String filePath) {
		this.filePath = filePath;
	}
	
	
	public List<Movie> loadFile() {
		
		List<Movie> movies = new ArrayList<Movie>();
		
		// Read CSV file at filePath.
		
		// Fill the list with the content of the file.
		
		// Return a list with the movies.		
		return movies;
	}
	
	
}
