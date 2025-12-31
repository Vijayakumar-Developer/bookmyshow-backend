package com.vijay.bookmyshow.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.bookmyshow.enitity.Booking;
import com.vijay.bookmyshow.service.BookingService;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

	private final BookingService bookingService;
	
	public BookingController (BookingService bookingService) {
		this.bookingService = bookingService ;
	}
	
	@PostMapping
	public ResponseEntity <Booking> createBooking(@RequestBody Booking booking){
		return new ResponseEntity<>(bookingService.createBooking(booking),HttpStatus.CREATED);
	}
}
