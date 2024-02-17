package org.example.SpringSem5Hmwrk.model;

import jakarta.persistence.*;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

/**
 * Класс Task, который представляет сущность задачи
 */
@Data
@Entity
public class Task {
    /**
     * Поле ID, которое является автоинкрементным и первичным ключом
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * Поле описания, которое не может быть пустым
     */
    @NotNull
    private String description;
    /**
     * Поле статуса, которое имеет одно из значений перечисления TaskStatus
     */
    @Enumerated(EnumType.STRING)
    private TaskStatus status;
    /**
     * Поле даты создания, которое автоматически устанавливается при создании задачи
     */
    @CreationTimestamp
    private LocalDateTime createdAt;


}
