package com.vijay.bookmyshow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijay.bookmyshow.enitity.Movie;

public interface MovieRepository extends JpaRepository < Movie , Long > {

}
