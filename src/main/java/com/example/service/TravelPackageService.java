package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.TravelPackage;

public interface TravelPackageService {
		
	public TravelPackage addPackage(TravelPackage travelPackage);
	public TravelPackage getByPackageId(int packageId);
	public List<TravelPackage> getAllPackages();
  
}
