package me.yachimiya.playground.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Car {
    @NotNull
    @Size(min = 14, max = 5)
    private String licensePlate;
}
