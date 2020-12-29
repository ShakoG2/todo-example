package com.todoexample.todoexample.controller;

import com.todoexample.todoexample.model.TodoItem;
import com.todoexample.todoexample.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("todo")
@RequiredArgsConstructor
public class TodoController {




    private final TodoService todoService;


    @GetMapping
    public List<TodoItem> getTodolist(){

        return todoService.getAll();
    }

    @PostMapping
    public ResponseEntity<TodoItem> addTodoItem(@RequestBody TodoItem todoitem){
        todoService.add(todoitem);
        return ResponseEntity.status(HttpStatus.CREATED).body(todoitem);
    }

    @PutMapping("{id}")
    public TodoItem updateTOdoItem(@PathVariable long id,
                                   @RequestBody TodoItem unsafeTodoItem){
        TodoItem todoitem=todoService.get(id);

        todoitem.setFirstName(unsafeTodoItem.getFirstName());
        todoitem.setLastName(unsafeTodoItem.getLastName());

        return todoService.update(todoitem);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deteleTOdo(@PathVariable long id){
        todoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
