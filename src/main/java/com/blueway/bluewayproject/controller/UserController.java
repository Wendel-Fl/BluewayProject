package com.blueway.bluewayproject.controller;

import com.blueway.bluewayproject.exceptions.UserException;
import com.blueway.bluewayproject.model.User;
import com.blueway.bluewayproject.service.impl.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = "api/v1/users")
public class UserController {

    @Autowired
    private final UserServiceImpl userService;

    @PostMapping(path = "/create")
    public ResponseEntity<User> addUser(
            @RequestBody User user
    ) throws UserException {
        User newUser = userService.addUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }
}
