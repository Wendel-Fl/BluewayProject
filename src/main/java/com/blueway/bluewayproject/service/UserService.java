package com.blueway.bluewayproject.service;

import com.blueway.bluewayproject.exceptions.UserException;
import com.blueway.bluewayproject.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    User getUserById(String id) throws UserException;

    User addUser(User user) throws UserException;
}
