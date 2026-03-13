package com.immersion.repository;

import com.immersion.crudGeneric.BaseRepository;
import com.immersion.entity.User;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends BaseRepository<User, UUID> {
}