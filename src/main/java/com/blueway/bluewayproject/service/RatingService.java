package com.blueway.bluewayproject.service;

import com.blueway.bluewayproject.model.Rating;

import java.util.List;
import java.util.Map;

public interface RatingService {

    Rating vote(Rating rating);

    Long getTotalVotes();

    Map<String, Long> getVotesByRealEstate();
}