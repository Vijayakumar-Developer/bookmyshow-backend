package com.vijay.bookmyshow.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vijay.bookmyshow.enitity.Booking;
import com.vijay.bookmyshow.repository.BookingRepository;
import com.vijay.bookmyshow.service.BookingService;

@Service
@Transactional
public class BookingServiceImpl implements BookingService {
	
	private final BookingRepository bookingRepository;
	
	public BookingServiceImpl(BookingRepository bookingRepository) {
		
		this.bookingRepository = bookingRepository;
	}

	@Override
	public Booking createBooking(Booking booking) {
		booking.setStatus("CONFIRMED");
		booking.setBookingTime(LocalDateTime.now());
		return bookingRepository.save(booking);
	
	}
	@Override
	public List<Booking> getBookingsByUser(Long userId){
		return bookingRepository.findAll();
	}
}
