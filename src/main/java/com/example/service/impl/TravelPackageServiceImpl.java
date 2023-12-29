package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.TravelPackage;
import com.example.repository.TravelPackageRepo;
import com.example.service.TravelPackageService;

@Service
public class TravelPackageServiceImpl implements TravelPackageService  {

	@Autowired
	TravelPackageRepo travelPackageRepo;

	@Override
	public TravelPackage addPackage(TravelPackage travelPackage) {
		return travelPackageRepo.save(travelPackage);
	}

	@Override
	public TravelPackage getByPackageId(int packageId) {
		return travelPackageRepo.findById(packageId).get();
	}

	@Override
	public List<TravelPackage> getAllPackages() {
		return travelPackageRepo.findAll();
	}
	
	
	

	


}
