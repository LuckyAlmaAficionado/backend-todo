package com.aplikasi.todo.database.aplikasi.todo.service;

import com.aplikasi.todo.database.aplikasi.todo.dto.todoDto;
import com.aplikasi.todo.database.aplikasi.todo.model.TodoModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public interface TodoService {

    List<TodoModel> getTodo() ;
    TodoModel postTodo(todoDto todoRes) ;
    String deleteTodo(Long id);

}
