package com.immersion.controller;

import com.immersion.entity.User;
import com.immersion.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController extends CrudController<User, UUID> {

    @Autowired
    protected UserController(UserService service) {
        super(service);
    }
}