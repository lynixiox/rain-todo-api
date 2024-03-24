package com.rain.todo.dto;

import com.rain.todo.entity.ToDo;
import org.springframework.data.annotation.Id;

import java.util.Objects;

public class TodoDto {

    @Id
    private String id;
    private ToDo.Status status;
    private String title;

    public TodoDto() {
    }

    public TodoDto(String id, ToDo.Status status, String title) {
        this.id = id;
        this.status = status;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ToDo.Status getStatus() {
        return status;
    }

    public void setStatus(ToDo.Status status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoDto todoDto = (TodoDto) o;
        return id == todoDto.id && status == todoDto.status && Objects.equals(title, todoDto.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, title);
    }

    @Override
    public String toString() {
        return "TodoDto{" +
                "id=" + id +
                ", status=" + status +
                ", title='" + title + '\'' +
                '}';
    }
}
