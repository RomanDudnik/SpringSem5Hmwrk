package org.example.SpringSem5Hmwrk.repository;

import org.example.SpringSem5Hmwrk.model.Task;
import org.example.SpringSem5Hmwrk.model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Интерфейс TaskRepository,
 * который наследует JpaRepository и предоставляет методы для работы с базой данных
 */
public interface TaskRepository extends JpaRepository<Task, Long> {
    // Метод для поиска задач по статусу
    public List<Task> findByStatus(TaskStatus status);
}
