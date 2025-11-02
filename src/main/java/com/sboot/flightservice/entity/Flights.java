package com.sboot.flightservice.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "flights")
public class Flights {

    @Id
    @Column(name = "flight_number", nullable = false, unique = true)
    private String flightNumber;
    private String origin;
    private String destination;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime departureTime;
    private double availableCargoWeight;
}
