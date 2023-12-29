package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Activity;
import com.example.entity.Destinations;
import com.example.service.ActivityService;
import com.example.service.DestinationService;

@RestController
@RequestMapping("/api/v1/Destinations")
public class DestinationsController {
	
	@Autowired
	DestinationService destinationService;
	@Autowired
	ActivityService activityService;
	
	@PostMapping("/add")
	public Destinations addDestinations(@RequestBody Destinations destinations) {
		return destinationService.addDestinations(destinations);
	}
	
	@PostMapping("/assignActivityToDestination/{destinationId}/{activityId}")
	public Destinations assignActivity(@PathVariable int destinationId,@PathVariable int activityId) {
		Activity activity=activityService.getByActivityId(activityId);
		Destinations destinations=destinationService.getByDestinationId(destinationId);
		destinations.getActivities().add(activity);
		destinationService.addDestinations(destinations);
		return destinations;
		
	}
		
}
