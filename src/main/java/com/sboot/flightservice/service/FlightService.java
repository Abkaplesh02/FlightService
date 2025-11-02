package com.sboot.flightservice.service;

import com.sboot.flightservice.dto.*;

import java.util.List;
import java.util.Optional;

public interface FlightService {
    List<FlightsDto> getAllFlights();

    FlightsDto getFlightByFlightNumber(String flightNumber);

    AddFlightRequestResponse addNewFlight(AddFlightsRequestDto addFlightsRequestDto);

    UpdateWeightResponseDto reduceWeight(String flightNumber, UpdateCargoWeightDto updateCargoWeightDto);
}
