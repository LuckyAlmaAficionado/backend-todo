package com.aplikasi.todo.database.aplikasi.todo.repository;

import com.aplikasi.todo.database.aplikasi.todo.model.TodoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoModel, Long> {
}
