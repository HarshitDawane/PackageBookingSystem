package com.example.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Travel Package Info")
public class TravelPackage {
	
	@Id
	private int id;
	
	private String name;
	
	private int passengerCapacity;
	
	
	@OneToMany
	private List<Destinations> itinerary;
	
	
	@OneToMany
	private List<Passenger> passengers;
	
	
		
}
