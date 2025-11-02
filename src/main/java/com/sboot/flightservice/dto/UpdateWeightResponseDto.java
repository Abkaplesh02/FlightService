package com.sboot.flightservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateWeightResponseDto {

    public String message;
    public double updatedAvaiableCargoWeight;
}
