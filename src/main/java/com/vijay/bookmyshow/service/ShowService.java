package com.vijay.bookmyshow.service;

import java.util.List;

import com.vijay.bookmyshow.enitity.Show;

public interface ShowService {
	
	Show createShow(Show show);
	List<Show> getShowsByMovie(Long movieId);

}
