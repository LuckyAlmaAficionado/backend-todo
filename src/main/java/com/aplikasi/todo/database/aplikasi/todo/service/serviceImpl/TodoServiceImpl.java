package com.aplikasi.todo.database.aplikasi.todo.service.serviceImpl;

import com.aplikasi.todo.database.aplikasi.todo.dto.todoDto;
import com.aplikasi.todo.database.aplikasi.todo.model.TodoModel;
import com.aplikasi.todo.database.aplikasi.todo.repository.TodoRepository;
import com.aplikasi.todo.database.aplikasi.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository repositori;

    @Override
    public List<TodoModel> getTodo() {
        return repositori.findAll();
    }

    @Override
    public TodoModel postTodo(todoDto todoRes) {
        return repositori.save(new TodoModel(0L, UUID.randomUUID(), todoRes.getTitle(), todoRes.getSubTitle(), LocalDateTime.now()));
    }

    @Override
    public String deleteTodo(Long id) {
        String msg;
        boolean empty = repositori.findById(id).isEmpty();
        if (empty) msg = "failed to delete data";
        else {
            repositori.deleteById(id);
            msg = "success to delete data";
        }
        return msg;
    }


}
