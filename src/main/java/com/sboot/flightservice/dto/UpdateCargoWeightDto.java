package com.sboot.flightservice.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UpdateCargoWeightDto {

    @NotBlank(message = "Add some weight to reduce ")
    private double weightToReduce;
}
