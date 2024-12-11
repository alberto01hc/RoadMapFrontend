package com.lacnaru.GesTa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lacnaru.GesTa.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
