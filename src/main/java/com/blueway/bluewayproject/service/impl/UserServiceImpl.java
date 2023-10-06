package com.blueway.bluewayproject.service.impl;

import com.blueway.bluewayproject.exceptions.UserException;
import com.blueway.bluewayproject.model.User;
import com.blueway.bluewayproject.repository.UserRepository;
import com.blueway.bluewayproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(String id) throws UserException {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserException(
                        "User with id " + id + " does not exist."
                ));
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }
}
