package com.blueway.bluewayproject.repository;

import com.blueway.bluewayproject.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface UserRepository extends MongoRepository<User, String> {

    @Query("{ 'cpf' : ?0 }")
    User findByCpf(String cpf);
}
