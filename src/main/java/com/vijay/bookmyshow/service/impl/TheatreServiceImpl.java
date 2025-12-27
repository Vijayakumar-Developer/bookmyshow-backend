package com.vijay.bookmyshow.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vijay.bookmyshow.enitity.Theatre;
import com.vijay.bookmyshow.repository.TheatreRepository;
import com.vijay.bookmyshow.service.TheatreService;

@Service
@Transactional
public class TheatreServiceImpl implements TheatreService {
	private final TheatreRepository theatreRepository;
	
	public TheatreServiceImpl(TheatreRepository theatreRepository) {
		this.theatreRepository = theatreRepository ;
		
	}
	
	@Override
	public Theatre createTheatre(Theatre theatre) {
		return theatreRepository.save(theatre);
	}
	
	@Override
	public List<Theatre> getAllTheatres(){
		return theatreRepository.findAll();
	}
	
}
