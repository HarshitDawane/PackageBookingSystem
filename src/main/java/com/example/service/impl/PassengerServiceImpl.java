package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Passenger;
import com.example.repository.PassengerRepo;
import com.example.service.PassengerService;


@Service
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	PassengerRepo passengerRepo;
	
	@Override
	public Passenger addPassenger(Passenger passenger) {
		return passengerRepo.save(passenger);
	}

	@Override
	public Passenger getByPassengerId(int passengerId) {
		return passengerRepo.findById(passengerId).get();
	}

	@Override
	public List<Passenger> getAllPassengers() {
		return passengerRepo.findAll();
	}
	
	@Override
	public void deletePassengerById(int passengerId) {
		passengerRepo.deleteById(passengerId);
	}

}
