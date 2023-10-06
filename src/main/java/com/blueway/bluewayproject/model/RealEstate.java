package com.blueway.bluewayproject.model;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum RealEstate {

    LE_JARDIN("Le Jardin"),
    EVIAN("Evian"),
    OLIMPIA_THERMAS("Olimpia Thermas");

    private final String name;

    @JsonValue
    public String getName() {
        return name;
    }
}
