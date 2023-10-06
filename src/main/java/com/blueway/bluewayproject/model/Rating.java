package com.blueway.bluewayproject.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    private User user;
    private RealEstate realEstate;
    private int rating;
}
