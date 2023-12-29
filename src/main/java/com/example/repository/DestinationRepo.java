package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Destinations;

@Repository
public interface DestinationRepo extends JpaRepository<Destinations, Integer> {

}
