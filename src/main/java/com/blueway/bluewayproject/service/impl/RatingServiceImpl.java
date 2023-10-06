package com.blueway.bluewayproject.service.impl;

import com.blueway.bluewayproject.repository.RatingRepository;
import com.blueway.bluewayproject.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;
}
