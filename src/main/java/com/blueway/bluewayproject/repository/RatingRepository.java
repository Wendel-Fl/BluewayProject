package com.blueway.bluewayproject.repository;

import com.blueway.bluewayproject.model.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RatingRepository extends MongoRepository<Rating, String> {
}
