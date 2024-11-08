package com.tp2.taskManager.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tp2.taskManager.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
