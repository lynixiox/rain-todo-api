package com.rain.todo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class TodoService {

    private final ToDoRepositry toDoRepositry;

    public List<ToDo> getAllTodos() {
        return toDoRepositry.findAll();
    }

}
