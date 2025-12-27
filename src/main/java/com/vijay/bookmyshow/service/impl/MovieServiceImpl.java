package com.vijay.bookmyshow.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vijay.bookmyshow.enitity.Movie;
import com.vijay.bookmyshow.repository.MovieRepository;
import com.vijay.bookmyshow.service.MovieService;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {
	
	private final MovieRepository movieRepository;
	
	public MovieServiceImpl(MovieRepository movieRepository) {
		this.movieRepository = movieRepository ;
		
	}
	
	@Override
	public Movie createMovie(Movie movie) {
		return movieRepository.save(movie);
	}
	
	@Override
	public List<Movie> getAllMovies(){
		return movieRepository.findAll();
	}
	
	@Override
	public Movie getMovieById(Long id) {
		return movieRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Movie Not Found !! "));
	}

}
