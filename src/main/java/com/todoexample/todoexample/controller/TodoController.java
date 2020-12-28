package com.todoexample.todoexample.controller;

import com.todoexample.todoexample.model.Todoitem;
import com.todoexample.todoexample.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("todo")
@RequiredArgsConstructor
public class TodoController {


    private TodoRepository todoRepository;


    @GetMapping
    public List<Todoitem> getTodolist(){
        return todoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Todoitem> addTodoitem(@RequestBody Todoitem todoitem){
        todoRepository.save(todoitem);
        return ResponseEntity.status(HttpStatus.CREATED).body(todoitem);
    }

}
