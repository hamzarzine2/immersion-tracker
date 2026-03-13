package com.immersion.service;

import com.immersion.crudGeneric.CrudServiceImpl;
import com.immersion.entity.User;
import com.immersion.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService extends CrudServiceImpl<User, UUID> {

    @Autowired
    public UserService(UserRepository repository) {
        super(repository);
    }
}