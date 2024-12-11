package com.lacnaru.GesTa.utils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.lacnaru.GesTa.dto.TaskDTO;
import com.lacnaru.GesTa.model.Task;

public class TaskConverter {

    // Convertir de TaskDTO a Task
    public static Task toTask(TaskDTO taskDTO) {
        if (taskDTO == null) {
            return null; // Si el DTO es nulo, retornamos null
        }

        // Verificamos si el DTO tiene valores nulos o vacíos y asignamos valores por defecto si es necesario
        String id = (taskDTO.getId() != null && !taskDTO.getId().isEmpty()) ? taskDTO.getId() : null;
        String name = (taskDTO.getName() != null && !taskDTO.getName().isEmpty()) ? taskDTO.getName() : null;
        String description = (taskDTO.getDescription() != null && !taskDTO.getDescription().isEmpty()) ? taskDTO.getDescription() : null;
        LocalDate date = taskDTO.getDate();  // Puede ser nulo
        LocalTime startTime = taskDTO.getStartTime();  // Puede ser nulo
        LocalTime endTime = taskDTO.getEndTime();  // Puede ser nulo
        List<String> category = taskDTO.getCategory();  // Puede ser nulo o vacío

        return new Task(id, name, description, date, startTime, endTime, category);
    }

    // Convertir de Task a TaskDTO
    public static TaskDTO toTaskDTO(Task task) {
        if (task == null) {
            return null; // Si la tarea es nula, retornamos null
        }

        // Verificamos si los campos de la tarea son nulos o vacíos y asignamos valores por defecto si es necesario
        String id = (task.getId() != null && !task.getId().isEmpty()) ? task.getId() : null;
        String name = (task.getName() != null && !task.getName().isEmpty()) ? task.getName() : null;
        String description = (task.getDescription() != null && !task.getDescription().isEmpty()) ? task.getDescription() : null;
        LocalDate date = task.getDate();  // Puede ser nulo
        LocalTime startTime = task.getStartTime();  // Puede ser nulo
        LocalTime endTime = task.getEndTime();  // Puede ser nulo
        List<String> category = task.getCategory();  // Puede ser nulo o vacío

        return new TaskDTO(id, name, description, date, startTime, endTime, category);
    }
}
