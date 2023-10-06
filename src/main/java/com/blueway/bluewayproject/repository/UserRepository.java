package com.blueway.bluewayproject.repository;

import com.blueway.bluewayproject.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
