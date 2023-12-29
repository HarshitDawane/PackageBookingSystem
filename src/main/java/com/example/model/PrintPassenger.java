package com.example.model;

import java.util.List;

import com.example.entity.Passenger;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PrintPassenger {

	private String travel_package_name;
	List<Passenger> passengers;
}
