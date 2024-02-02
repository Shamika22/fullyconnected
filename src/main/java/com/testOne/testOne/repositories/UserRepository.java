package com.testOne.testOne.repositories;

import com.testOne.testOne.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findUserByUserID(int id);
}
