package com.vijay.bookmyshow.service;

import java.util.List;

import com.vijay.bookmyshow.enitity.Theatre;

public interface TheatreService {

	Theatre createTheatre(Theatre theatre);
	List<Theatre> getAllTheatres();
}
