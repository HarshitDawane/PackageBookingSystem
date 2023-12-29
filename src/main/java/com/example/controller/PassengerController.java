package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Activity;
import com.example.entity.Passenger;
import com.example.service.ActivityService;
import com.example.service.PassengerService;

@RestController
@RequestMapping("/api/v1/passenger")
public class PassengerController {
	
	@Autowired
	PassengerService passengerService;
	
	@Autowired
	ActivityService activityService;
	
	@PostMapping("/add")
	public ResponseEntity<Passenger> addPassenger(@RequestBody Passenger passenger) {
		return new ResponseEntity<Passenger>(passengerService.addPassenger(passenger), HttpStatus.OK);
	}
	
	@PostMapping("/assignActivityToPassenger/{activityId}/{passengerId}")
	public Passenger assignActivity(@PathVariable int activityId,@PathVariable int passengerId) {
		Activity activity = activityService.getByActivityId(activityId);
		Passenger passenger = passengerService.getByPassengerId(passengerId);
		System.out.println("hhh"+passenger);
		passenger.getActivities().add(activity);
		passengerService.addPassenger(passenger);
		return passenger;
		
	}
	
	@GetMapping("/getPassengerById/{passengerId}")
	public ResponseEntity<Passenger> getPassengerById(@PathVariable int passengerId) {
		return new ResponseEntity<Passenger>(passengerService.getByPassengerId(passengerId), HttpStatus.OK);
	}

}
