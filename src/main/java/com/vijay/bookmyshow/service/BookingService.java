package com.vijay.bookmyshow.service;

import java.util.List;

import com.vijay.bookmyshow.enitity.Booking;

public interface BookingService {
	
	Booking createBooking(Booking booking);
	List<Booking> getBookingsByUser(Long UserId);

}
