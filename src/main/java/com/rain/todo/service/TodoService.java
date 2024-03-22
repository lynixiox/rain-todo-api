package com.rain.todo.service;

import com.rain.todo.dto.TodoDto;

import java.util.List;

public interface TodoService {

    List<TodoDto> getAllTodos();
    TodoDto createTodo(TodoDto todoDto);


}
