package com.rain.todo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}


	@Bean
	CommandLineRunner runner(ToDoRepositry repositry){

		return args -> {
			ToDo toDo = new ToDo(
					"Do Homework",
					"Need to finish the math homework",
					LocalDateTime.now()
			);
			repositry.insert(toDo);


		};

	}

}
