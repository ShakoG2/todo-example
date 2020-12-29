package com.todoexample.todoexample.service;

import com.todoexample.todoexample.model.TodoItem;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {
    List<TodoItem> getAll();

    TodoItem add(TodoItem todoitem);

    TodoItem get(long id);

    TodoItem update(TodoItem todoitem);

    void delete(long id);


}
