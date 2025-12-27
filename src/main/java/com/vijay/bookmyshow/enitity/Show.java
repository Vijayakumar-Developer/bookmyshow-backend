package com.vijay.bookmyshow.enitity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="shows")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Show {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private LocalDateTime showTime;
	
	private Double price;
	
	@ManyToOne
	@JoinColumn(name ="movie_id")
	private Movie movie;
	
	@ManyToOne
	@JoinColumn(name="theatre_id")
	private Theatre theatre;
	
	
}
