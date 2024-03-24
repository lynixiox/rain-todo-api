package com.rain.todo.controller;

import com.rain.todo.dto.TodoDto;
import com.rain.todo.entity.ToDo;
import com.rain.todo.service.TodoService;
import com.rain.todo.service.TodoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
public class ToDoController {

    private final TodoServiceImpl todoService;

    public ToDoController(TodoServiceImpl todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<TodoDto>> fetchAllTodos(){
        return new ResponseEntity<>(todoService.getAllTodos(), HttpStatus.OK);
    }

    @PostMapping("/create")
    @CrossOrigin("*")
    public ResponseEntity<TodoDto> createTodo(@RequestBody TodoDto todoDto){
        System.out.println(todoDto);
        return new ResponseEntity<>(todoService.createTodo(todoDto),HttpStatus.CREATED);
    }

    @PostMapping("/update/{id}")
    @CrossOrigin("*")
    public ResponseEntity<TodoDto> updateTask(@RequestBody TodoDto todoDto){
        System.out.println(todoDto);
    }
}


