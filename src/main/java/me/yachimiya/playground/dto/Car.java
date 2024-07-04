package me.yachimiya.playground.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Car {
    @NotNull
    @Size(min = 14, max = 2)
    private String licensePlate;
}
