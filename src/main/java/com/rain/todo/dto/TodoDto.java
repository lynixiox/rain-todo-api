package com.rain.todo.dto;

import com.rain.todo.entity.ToDo;

import java.util.Objects;

public class TodoDto {
    private ToDo.Status status;
    private String title;

    public TodoDto() {
    }

    @Override
    public String toString() {
        return "TodoDto{" +
                "status=" + status +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoDto todoDto = (TodoDto) o;
        return status == todoDto.status && Objects.equals(title, todoDto.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, title);
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

    public TodoDto(ToDo.Status status, String title) {
        this.status = status;
        this.title = title;
    }
}
