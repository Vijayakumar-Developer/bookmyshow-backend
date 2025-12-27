package com.vijay.bookmyshow.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vijay.bookmyshow.enitity.Show;
import com.vijay.bookmyshow.repository.ShowRepository;
import com.vijay.bookmyshow.service.ShowService;

@Service
@Transactional
public class ShowServiceImpl implements ShowService {
	
	private final ShowRepository showRepository;
	
	public ShowServiceImpl(ShowRepository showRepository) {
		
		this.showRepository = showRepository ;
	}
	
	@Override
	public Show createShow(Show show) {
		return showRepository.save(show);
	}
	
	@Override
	public List<Show> getShowsByMovie(Long movieId){
		return showRepository.findAll();
	}

}
