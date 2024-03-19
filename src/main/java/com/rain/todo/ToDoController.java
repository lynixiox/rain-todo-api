package com.rain.todo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
@AllArgsConstructor
public class ToDoController {

    private final TodoService todoService;

    @GetMapping
    public List<ToDo> fetchAllTodos(){
        return todoService.getAllTodos();
    }

}
