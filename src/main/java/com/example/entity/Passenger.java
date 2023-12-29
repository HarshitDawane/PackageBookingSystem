package com.example.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "Passenger")
public class Passenger {

	@Id
	private int id;
	
	private String name;
	private long passengerNumber;
	private int balance;
	private String category;	

	@OneToMany
	private List<Activity> activities;
}
