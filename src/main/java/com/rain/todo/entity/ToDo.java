package com.rain.todo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class ToDo {
    @Id
    private String id;
    private String title;
    private Status status;

    private LocalDateTime created;

    public enum Status{
        TODO,
        Completed,
        IN_PROGRESS

    }

    public ToDo() {
    }

    public ToDo(String title, Status status, LocalDateTime created) {
        this.title = title;
        this.status = status;
        this.created = created;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", status=" + status +
                ", created=" + created +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDo toDo = (ToDo) o;
        return Objects.equals(title, toDo.title) && status == toDo.status && Objects.equals(created, toDo.created);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, status, created);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}
