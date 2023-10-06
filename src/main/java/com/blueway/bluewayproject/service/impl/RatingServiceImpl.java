package com.blueway.bluewayproject.service.impl;

import com.blueway.bluewayproject.exceptions.RatingException;
import com.blueway.bluewayproject.model.Rating;
import com.blueway.bluewayproject.model.User;
import com.blueway.bluewayproject.repository.RatingRepository;
import com.blueway.bluewayproject.repository.UserRepository;
import com.blueway.bluewayproject.service.RatingService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public Rating vote(Rating rating) throws RatingException {
        String vote = "vote";

        Optional<Rating> ratingOptional = ratingRepository.findByUser(rating.getUser());
        Optional<User> userOptional = Optional.ofNullable(userRepository.findByCpf(rating.getUser().getCpf()));

        if (ratingOptional.isPresent()) {
            throw new RatingException("Usuário já votou.");
        }

        if (userOptional.isEmpty()) {
            throw new RatingException("Usuário não existe.");
        }

        if (rating.getVote() == null || !rating.getVote().equals(vote)) {
            throw new RatingException("Voto inválido.");
        }

        if (rating.getRealEstate() == null) {
            throw new RatingException("Imóvel não pode ser nulo.");
        }

        if (rating.getUser() == null) {
            throw new RatingException("Usuário não pode ser nulo.");
        }

        return ratingRepository.save(rating);
    }

    @Override
    public Long getTotalVotes() {
        return ratingRepository.count();
    }

    @Override
    public Map<String, Long> getVotesByRealEstate() {
        List<Rating> ratings = ratingRepository.findAll();
        Map<String, Long> votesByRealEstate = new HashMap<>();

        for (Rating rating : ratings) {
            String realEstateName = rating.getRealEstate().getName();
            votesByRealEstate.put(realEstateName, votesByRealEstate.getOrDefault(realEstateName, 0L) + 1);
        }

        return votesByRealEstate;
    }
}
