package com.aplikasi.todo.database.aplikasi.todo.controller;

import com.aplikasi.todo.database.aplikasi.todo.dto.MessageModel;
import com.aplikasi.todo.database.aplikasi.todo.dto.todoDto;
import com.aplikasi.todo.database.aplikasi.todo.model.TodoModel;
import com.aplikasi.todo.database.aplikasi.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoService service;

    @PostMapping("/post-todo")
    public ResponseEntity<MessageModel> postTodo(@RequestBody todoDto todoReq) {
        MessageModel msg = new MessageModel();
        TodoModel response = service.postTodo(todoReq);

        if(response == null) {
            msg.setMessage("failed get data");
            msg.setData(null);
            return ResponseEntity.badRequest().body(msg);
        } else {
            msg.setMessage("success get data");
            msg.setData(response);
            return ResponseEntity.ok(msg);
        }
    }

    @GetMapping("/get-todo")
    public ResponseEntity<MessageModel> getTodo() {
        MessageModel msg = new MessageModel();
        List<TodoModel> response = service.getTodo();

        if(response == null) {
            msg.setMessage("failed get data");
            msg.setData(null);
            return ResponseEntity.badRequest().body(msg);
        } else {
            msg.setMessage("success get data");
            msg.setData(response);
            return ResponseEntity.ok(msg);
        }
    }

    @DeleteMapping("/delete-todo/{id}")
    public ResponseEntity<MessageModel> deleteTodo(@PathVariable("id") Long id) {
        MessageModel msg = new MessageModel();
        String response = service.deleteTodo(id);

        if(response == null) {
            msg.setMessage("failed get data");
            msg.setData(null);
            return ResponseEntity.badRequest().body(msg);
        } else {
            msg.setMessage("success get data");
            msg.setData(response);
            return ResponseEntity.ok(msg);
        }
    }

}
