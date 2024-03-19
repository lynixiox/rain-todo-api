package com.rain.todo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/**
 * @Data Removes the Getters, Setters and Constructor Boiler plate.
 * @Data Adds The Getters and Setters in the background
 */
@Data
@Document
public class ToDo {
    @Id
    private String id;
    private String title;
    private String description;
    private LocalDateTime created;

    public ToDo(String title, String description, LocalDateTime created) {
        this.title = title;
        this.description = description;
        this.created = created;
    }
}
