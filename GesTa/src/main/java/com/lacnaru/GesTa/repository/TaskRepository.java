package com.lacnaru.GesTa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lacnaru.GesTa.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, String>{
    
}
