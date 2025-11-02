package com.sboot.flightservice.controller;

import com.sboot.flightservice.dto.*;
import com.sboot.flightservice.service.FlightService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightsController {

    private final FlightService flightService;

    public FlightsController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping
    public ResponseEntity<List<FlightsDto>> getAllFlights(){
        return ResponseEntity.ok(flightService.getAllFlights());
    }

    @GetMapping("/{flightNumber}")
    public ResponseEntity<FlightsDto> getFlightByFlightNumber(@PathVariable String flightNumber){
        return ResponseEntity.ok(flightService.getFlightByFlightNumber(flightNumber));
    }

    @PostMapping
    public ResponseEntity<AddFlightRequestResponse> addNewFlight(@RequestBody AddFlightsRequestDto addFlightsRequestDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(flightService.addNewFlight(addFlightsRequestDto));
    }

    @PutMapping("/{flightNumber}")
    public ResponseEntity<UpdateWeightResponseDto> updateCargoWeight(@PathVariable String flightNumber, @RequestBody UpdateCargoWeightDto updateCargoWeightDto){
        return ResponseEntity.ok(flightService.reduceWeight(flightNumber,updateCargoWeightDto));
    }

}
