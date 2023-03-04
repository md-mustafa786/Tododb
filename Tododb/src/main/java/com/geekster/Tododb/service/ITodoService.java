package com.geekster.Tododb.service;


import com.geekster.Tododb.model.Todo;

import java.util.List;

public interface ITodoService {
    public List<Todo> findAll();

    public Todo findById(int id);

    public void addTodo(Todo todo);

    public void deleteTodo(int id);

    public void updateTodo(int id, Todo newTodo);
}