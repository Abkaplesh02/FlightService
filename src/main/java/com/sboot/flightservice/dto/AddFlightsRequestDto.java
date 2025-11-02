package com.sboot.flightservice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AddFlightsRequestDto {

    @NotBlank(message = "Flight number is required")
    @Size(min = 5, max = 5, message = "Flight number must be of 5 characters")
    private String flightNumber;

    @NotBlank(message = "Origin is required")
    @Size(min = 3, max = 5, message = "Origin must be of between 3 to 5 characters")
    private String origin;

    @NotBlank(message = "Destination is required")
    @Size(min = 3, max = 5, message = "Destination must be of between 3 to 5 characters")
    private String destination;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime departureTime;

    @NotBlank(message = "Available cargo weight is required")
    private double availableCargoWeight;
}
