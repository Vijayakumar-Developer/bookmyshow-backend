package com.vijay.bookmyshow.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.bookmyshow.enitity.Theatre;
import com.vijay.bookmyshow.service.TheatreService;

@RestController
@RequestMapping("api/theatres")
public class TheatreController {

	private final TheatreService theatreService;
	
	public TheatreController (TheatreService theatreService) {
		
		this.theatreService = theatreService ;
	}
	
	@PostMapping
	public ResponseEntity<Theatre> createTheatre(@RequestBody Theatre theatre){
		return new ResponseEntity<>(theatreService.createTheatre(theatre),HttpStatus.CREATED);
	}
	@GetMapping
	public ResponseEntity<List<Theatre>> getAllTheatres(){
		return ResponseEntity.ok(theatreService.getAllTheatres());
	}
	
}
