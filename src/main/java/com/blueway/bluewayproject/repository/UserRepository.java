package com.blueway.bluewayproject.repository;

import com.blueway.bluewayproject.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    User findByCpf(String cpf);
}
