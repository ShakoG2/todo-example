package com.todoexample.todoexample.service;

import com.todoexample.todoexample.model.Todoitem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {
    List<Todoitem> getAll();

    Todoitem add(Todoitem todoitem);
}
