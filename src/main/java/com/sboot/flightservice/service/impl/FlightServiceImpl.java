package com.sboot.flightservice.service.impl;

import com.sboot.flightservice.dto.*;
import com.sboot.flightservice.entity.Flights;
import com.sboot.flightservice.exception.FlightNotFoundException;
import com.sboot.flightservice.repository.FlightRepository;
import com.sboot.flightservice.service.FlightService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {

    private final FlightRepository flightRepository;
    private final ModelMapper modelMapper;

    public FlightServiceImpl(FlightRepository flightRepository, ModelMapper modelMapper) {
        this.flightRepository = flightRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<FlightsDto> getAllFlights() {
        List<Flights> flights=flightRepository.findAll();
        List<FlightsDto>flightsDto=flights.stream().map(flight->modelMapper.map(flight,FlightsDto.class)).toList();
        return flightsDto;
    }

    @Override
    public FlightsDto getFlightByFlightNumber(String flightNumber) {
        Flights flight = flightRepository.findById(flightNumber)
                .orElseThrow(() -> new FlightNotFoundException("No flight found with flight number: " + flightNumber));
        return modelMapper.map(flight, FlightsDto.class);
    }

    @Override
    public AddFlightRequestResponse addNewFlight(AddFlightsRequestDto addFlightsRequestDto) {
        if (flightRepository.existsById(addFlightsRequestDto.getFlightNumber())) {
            return new AddFlightRequestResponse("Flight already exists",addFlightsRequestDto.getFlightNumber());
        }
        Flights flight=flightRepository.save(modelMapper.map(addFlightsRequestDto, Flights.class));
        return new AddFlightRequestResponse("Flight created successfully",flight.getFlightNumber());
    }

    @Override
    public UpdateWeightResponseDto reduceWeight(String flightNumber, UpdateCargoWeightDto updateCargoWeightDto) {
        Flights flight=flightRepository.findById(flightNumber).orElseThrow(()->new FlightNotFoundException("No flight found with flight number: " + flightNumber));
        double weightToReduce=updateCargoWeightDto.getWeightToReduce();
        if (weightToReduce > flight.getAvailableCargoWeight()) {
            throw new IllegalArgumentException("Cannot reduce weight more than available cargo capacity.");
        }
        double updatedWeight = flight.getAvailableCargoWeight() - weightToReduce;
        flight.setAvailableCargoWeight(updatedWeight);
        Flights updatedFlight = flightRepository.save(flight);
        return new UpdateWeightResponseDto("Flight cargo weight updated successfully",updatedFlight.getAvailableCargoWeight());

    }
}
