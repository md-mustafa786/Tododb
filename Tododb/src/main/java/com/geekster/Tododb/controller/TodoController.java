package com.geekster.Tododb.controller;


import com.geekster.Tododb.model.Todo;
import com.geekster.Tododb.service.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/* TODO-APP: CREATE, FETCH, UPDATE, DELETE */

@RestController
@RequestMapping("/api/v1/todo-app")
public class TodoController {



    // when we used @Autowired annotation, the spring container auto-wires the bean by matching data-types.
    // inject object
    @Autowired
    private ITodoService todoService;

    //add todo
    @PostMapping("/add-todo")
    public void addTodo(@RequestBody Todo todo) {
        todoService.addTodo(todo);
    }

     // find by id todo
    @GetMapping("/find-todo/id/{id}")
    public Todo findTodoById(@PathVariable int id) {
        return todoService.findById(id);
    }

     // find all todo
    @GetMapping("find-all")
    public List<Todo> findAllTodos() { // controller is talking to the service layer
        return todoService.findAll();
    }

    // update todo
    @PutMapping("update-todo/id/{id}")
    public void updateTodo(@PathVariable int id,@RequestBody Todo todo) {
        todoService.updateTodo(id,todo);
    }


    //delete todo
    @DeleteMapping("delete-todo/id/{id}")
    public void deleteTodo(@PathVariable int id) {
        todoService.deleteTodo(id);
    }

}