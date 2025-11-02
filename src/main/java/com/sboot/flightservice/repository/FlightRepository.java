package com.sboot.flightservice.repository;

import com.sboot.flightservice.entity.Flights;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flights,String> {
}
