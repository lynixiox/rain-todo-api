package com.rain.todo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepositry extends MongoRepository<ToDo, String> {

}
