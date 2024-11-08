package com.tp2.taskManager.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tp2.taskManager.dao.TaskRepository;
import com.tp2.taskManager.entity.Task;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public Task updateTask(Long id, Task updatedTask) {
        Task task = getTaskById(id);
        if (task != null) {

            task.setDescription(updatedTask.getDescription());
            task.setCreationDate(updatedTask.getCreationDate());
            task.setEnhanceDate(updatedTask.getEnhanceDate());
            return taskRepository.save(task);
        }
        return null;
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);

    }

}
