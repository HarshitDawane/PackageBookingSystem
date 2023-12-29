package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Destinations;
import com.example.entity.Passenger;
import com.example.entity.TravelPackage;
import com.example.model.PrintItinerary;
import com.example.model.PrintPassenger;
import com.example.repository.TravelPackageRepo;
import com.example.service.DestinationService;

@RestController
@RequestMapping("/api/v1/travelPackage")
public class TravelPackageController {

	@Autowired
	TravelPackageRepo travelPackageRepo;
	@Autowired
	DestinationService destinationService;

	@PostMapping("/add")
	public TravelPackage addTravelPacakge(@RequestBody TravelPackage travelPackage) {
		return travelPackageRepo.save(travelPackage);
	}

	@GetMapping("/printItinerary/{travelPackageId}")
	public PrintItinerary printItinerary(@PathVariable int travelPackageId) {
		TravelPackage travelPackage=travelPackageRepo.findById(travelPackageId).get();
		List<Destinations> destinations=travelPackage.getItinerary();	
		PrintItinerary printItinerary=new PrintItinerary(travelPackage.getName(),travelPackage.getItinerary());
		return printItinerary;

	}
	 
	@GetMapping("/printPassanger/{travelPackageId}")
	public PrintPassenger printPassangers(@PathVariable int travelPackageId) {
		TravelPackage travelPackage=travelPackageRepo.findById(travelPackageId).get();
		List<Passenger> passengers=travelPackage.getPassengers();	
		PrintPassenger printPassenger=new PrintPassenger();
		printPassenger.setTravel_package_name(travelPackage.getName());
		printPassenger.setPassengers(passengers);
		return printPassangers(0);

	}

	@PostMapping("/assignDestinationToTravel/{destinationId}/{travelId}")
	public TravelPackage assignActivity(@PathVariable int destinationId,@PathVariable int travelId) {
		Destinations destinations=destinationService.getByDestinationId(destinationId);
		TravelPackage travelPackage=travelPackageRepo.findById(travelId).get();
		travelPackage.getItinerary().add(destinations);
		travelPackageRepo.save(travelPackage);
		return travelPackage;
		
	}

}
