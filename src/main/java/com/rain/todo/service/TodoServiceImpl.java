package com.rain.todo.service;

import com.rain.todo.dto.TodoDto;
import com.rain.todo.entity.ToDo;
import com.rain.todo.repository.ToDoRepositry;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TodoServiceImpl implements TodoService{

    private final ToDoRepositry toDoRepositry;

    public TodoServiceImpl(ToDoRepositry toDoRepositry) {
        this.toDoRepositry = toDoRepositry;
    }


    @Override
    public List<TodoDto> getAllTodos() {
        List<ToDo> toDoList = toDoRepositry.findAll();
        List<TodoDto> todoDtoList = new ArrayList<>();
        for (ToDo todo: toDoList){
            todoDtoList.add(mapToDto(todo));
        }
        return todoDtoList;
    }

    @Override
    public TodoDto createTodo(TodoDto todoDto) {
        ToDo toDo = toDoRepositry.save(mapToEntity(todoDto));
        return mapToDto(toDo);
    }

    private TodoDto mapToDto(ToDo todo){
        TodoDto todoDto = new TodoDto();
        todoDto.setTitle(todo.getTitle());
        todoDto.setStatus(todo.getStatus());

        return todoDto;
    }

    private ToDo mapToEntity(TodoDto todoDto){
        ToDo todo = new ToDo();
        todo.setTitle(todoDto.getTitle());
        todo.setStatus(todoDto.getStatus());

        return todo;
    }
}
