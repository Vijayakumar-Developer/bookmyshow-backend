package com.vijay.bookmyshow.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.bookmyshow.enitity.Show;
import com.vijay.bookmyshow.service.ShowService;

@RestController
@RequestMapping("api/shows")
public class ShowController {

	private final ShowService showService;
	
	public ShowController (ShowService showService) {
		this.showService = showService ;
	}
	
	@PostMapping
	public ResponseEntity<Show> createShow(@RequestBody Show show){
		return new ResponseEntity<>(showService.createShow(show),HttpStatus.CREATED);
	}
}
