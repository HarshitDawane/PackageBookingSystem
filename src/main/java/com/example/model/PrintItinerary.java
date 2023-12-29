package com.example.model;

import java.util.List;

import com.example.entity.Activity;
import com.example.entity.Destinations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PrintItinerary {

	private String travel_package_name;
	List<Destinations> destinations;


}
