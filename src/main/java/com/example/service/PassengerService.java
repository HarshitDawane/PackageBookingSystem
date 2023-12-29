package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Activity;
import com.example.entity.Passenger;

@Service
public interface PassengerService {
	
	public Passenger addPassenger(Passenger passenger);
	public Passenger getByPassengerId(int passengerId);
	public List<Passenger> getAllPassengers();
	public void deletePassengerById(int passengerId);
}
