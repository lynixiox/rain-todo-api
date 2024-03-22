package com.rain.todo.repository;

import com.rain.todo.entity.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepositry extends MongoRepository<ToDo, String> {

}
