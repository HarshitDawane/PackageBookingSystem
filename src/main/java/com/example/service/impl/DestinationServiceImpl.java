package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Destinations;
import com.example.repository.DestinationRepo;
import com.example.service.DestinationService;

@Service
public class DestinationServiceImpl implements DestinationService {
	
	@Autowired
	DestinationRepo destinationRepo;

	@Override
	public Destinations addDestinations(Destinations destinations) {
		return destinationRepo.save(destinations);
	}

	@Override
	public Destinations getByDestinationId(int destinationId) {
		return destinationRepo.findById(destinationId).get();
	}

	@Override
	public List<Destinations> getAllDestinations() {
		return destinationRepo.findAll();
	}



}
