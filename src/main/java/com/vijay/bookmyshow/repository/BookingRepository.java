package com.vijay.bookmyshow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijay.bookmyshow.enitity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}
