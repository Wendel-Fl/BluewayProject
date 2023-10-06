package com.blueway.bluewayproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RealEstate {

    LE_JARDIN("Le Jardin"),
    EVIAN("Evian"),
    OLIMPIA_THERMAS("Olimpia Thermas");

    private final String name;

}
