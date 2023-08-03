package com.aplikasi.todo.database.aplikasi.todo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Data
@Table(name = "todo")
public class TodoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    UUID todoUUID;

    String title;

    String subTitle;

    LocalDateTime createdAt;

    public TodoModel(Long id, UUID todoUUID, String title, String subTitle, LocalDateTime createdAt) {
        this.id = id;
        this.todoUUID = todoUUID;
        this.title = title;
        this.subTitle = subTitle;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getTodoUUID() {
        return todoUUID;
    }

    public void setTodoUUID(UUID todoUUID) {
        this.todoUUID = todoUUID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public LocalDateTime getDate() {
        return createdAt;
    }

    public void setDate(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
