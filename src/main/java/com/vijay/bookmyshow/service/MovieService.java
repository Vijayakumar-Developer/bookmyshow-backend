package com.vijay.bookmyshow.service;

import java.util.List;

import com.vijay.bookmyshow.enitity.Movie;

public interface MovieService {
	
	Movie createMovie(Movie movie);
	 
	List<Movie> getAllMovies();
	
	Movie getMovieById(Long id);
	

}
