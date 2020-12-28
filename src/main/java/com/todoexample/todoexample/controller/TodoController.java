package com.todoexample.todoexample.controller;

import com.todoexample.todoexample.model.Todoitem;
import com.todoexample.todoexample.repository.TodoRepository;
import com.todoexample.todoexample.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("todo")
@RequiredArgsConstructor
public class TodoController {

    private TodoService todoService;


    @GetMapping
    public List<Todoitem> getTodolist(){
        return todoService.getAll();
    }
    @PostMapping
    public ResponseEntity<Todoitem> addTodoitem(@RequestBody Todoitem todoitem){
        return ResponseEntity.status(HttpStatus.CREATED).body(todoService.add(todoitem));
    }

}
