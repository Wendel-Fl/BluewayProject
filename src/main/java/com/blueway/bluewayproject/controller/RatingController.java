package com.blueway.bluewayproject.controller;

import com.blueway.bluewayproject.service.impl.RatingServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = "api/v1/ratings")
public class RatingController {

    @Autowired
    private final RatingServiceImpl ratingService;
}
