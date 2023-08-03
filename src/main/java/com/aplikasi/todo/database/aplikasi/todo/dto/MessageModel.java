package com.aplikasi.todo.database.aplikasi.todo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageModel<T> {
    private String message;
    private T data;
}
