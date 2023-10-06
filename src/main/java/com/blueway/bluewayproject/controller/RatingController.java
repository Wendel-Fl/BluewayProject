package com.blueway.bluewayproject.controller;

import com.blueway.bluewayproject.exceptions.RatingException;
import com.blueway.bluewayproject.model.Rating;
import com.blueway.bluewayproject.model.VotingStatus;
import com.blueway.bluewayproject.service.impl.RatingServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping(path = "api/v1/ratings")
public class RatingController {

    @Autowired
    private final RatingServiceImpl ratingService;

    @PostMapping(path = "/vote")
    public ResponseEntity<Rating> vote(@RequestBody Rating rating) throws RatingException {
        Rating newRating = ratingService.vote(rating);
        return new ResponseEntity<>(newRating, HttpStatus.CREATED);
    }


    @GetMapping("/status")
    public ResponseEntity<VotingStatus> getTotalVotes() {
        long totalVotes = ratingService.getTotalVotes();
        Map<String, Long> votesByRealEstate = ratingService.getVotesByRealEstate();

        VotingStatus response = new VotingStatus(totalVotes, votesByRealEstate);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
