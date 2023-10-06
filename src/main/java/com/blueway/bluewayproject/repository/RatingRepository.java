package com.blueway.bluewayproject.repository;

import com.blueway.bluewayproject.model.Rating;
import com.blueway.bluewayproject.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface RatingRepository extends MongoRepository<Rating, String> {

    @Query("{ 'user' : ?0 }")
    Optional<Rating> findByUser(User user);

}
