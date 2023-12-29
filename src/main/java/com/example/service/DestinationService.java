package com.example.service;

import java.util.List;

import com.example.entity.Destinations;

public interface DestinationService {
	
	public Destinations addDestinations(Destinations destinations);
	public Destinations getByDestinationId(int destinationId);
	public List<Destinations> getAllDestinations();

}
