package com.example.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.entity.Activity;
import com.example.entity.Destinations;
import com.example.entity.Passenger;
import com.example.entity.TravelPackage;
import com.example.model.PrintItinerary;
import com.example.model.PrintPassenger;
import com.example.repository.TravelPackageRepo;
import com.example.service.TravelPackageService;

@SpringBootTest
public class TravelPackageControllerTest {
	
	
	
	@Autowired
	TravelPackageService travelPackageService;
	
	@MockBean
	TravelPackageRepo travelPackageRepo;
	
	@Autowired
	TravelPackageController travelPackageController;

	Activity activity;
	Destinations destinations;
	
	 
	
	@Test
	public void addTravelPackageTest() {	
		TravelPackage travelPackage = new TravelPackage();
		travelPackage.setId(1);
		travelPackage.setName("XYZ");
		travelPackage.setPassengerCapacity(58);
		when(travelPackageRepo.save(travelPackage)).thenReturn(travelPackage);
		assertEquals(travelPackage, travelPackageService.addPackage(travelPackage));
	} 
	
	
	@Test
	public void PrintItineraryTest() {
		PrintItinerary printItinerary = new PrintItinerary();
		TravelPackage travelPackage = new TravelPackage();
		travelPackage.setId(1);
		travelPackage.setName("Raj Ratan");
	    printItinerary.setTravel_package_name(travelPackage.getName());
	    activity=new Activity(1,"Go-karting","Demo",1000,20);
	    List<Activity> activities=Arrays.asList(activity,activity);
		destinations=new Destinations(1,"D1",activities);
	    List<Destinations> list=Arrays.asList(destinations,destinations);
	    printItinerary.setDestinations(list);
	    assertEquals(printItinerary.getTravel_package_name(),travelPackage.getName());

	}
	
	@Test 
	public void  printPassangers() {
		TravelPackage travelPackage = new TravelPackage();
		travelPackage.setId(1);
		travelPackage.setName("Raj Ratan");
		activity=new Activity(1,"Go-karting","Demo",1000,20);
	    List<Activity> activities=Arrays.asList(activity,activity);
		Passenger p1=new Passenger(1, "P1", 1234, 1000, "Gold", activities);
		travelPackage.setPassengers(Arrays.asList(p1));
		PrintPassenger printItinerary=new PrintPassenger(travelPackage.getName(),Arrays.asList(p1));
		assertEquals(travelPackage.getPassengers(), Arrays.asList(p1));

	}
	
	
	


}
