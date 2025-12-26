package com.vijay.bookmyshow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijay.bookmyshow.enitity.User;

public interface UserRepository extends JpaRepository<User , Long> {

}
