package com.lacnaru.GesTa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lacnaru.GesTa.dto.TaskDTO;
import com.lacnaru.GesTa.service.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired 
    private TaskService taskService;

    @PostMapping
    public void addTask(@RequestBody TaskDTO task) {
        taskService.add(task);
    }

    @PutMapping
    public void updateTask(@RequestBody TaskDTO task) {
        taskService.add(task);
    }

}
