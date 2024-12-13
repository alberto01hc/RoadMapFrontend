package com.lacnaru.GesTa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lacnaru.GesTa.dto.TaskDTO;
import com.lacnaru.GesTa.model.Task;
import com.lacnaru.GesTa.repository.TaskRepository;
import com.lacnaru.GesTa.utils.TaskConverter;

@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepository;

    public void add(TaskDTO task){
        taskRepository.save(TaskConverter.toTask(task));
    }

    public List<Task> get(){
        return taskRepository.findAll();
    }

}
