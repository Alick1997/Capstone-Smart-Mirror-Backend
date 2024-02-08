package com.capstonesmartmirror.repository;

import com.capstonesmartmirror.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface UserRepository extends MongoRepository<User, String> {

    @Query("{userId: '?0'}")
    User findByUserId(String userId);
}
