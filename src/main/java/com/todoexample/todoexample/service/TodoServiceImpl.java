package com.todoexample.todoexample.service;

import com.todoexample.todoexample.model.TodoItem;
import com.todoexample.todoexample.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;

    @Override
    public List<TodoItem> getAll(){
        return todoRepository.findAll();
    }

    @Override
    public TodoItem get(long id){
        return todoRepository.getOne(id);
    }

    @Override
    public TodoItem update(TodoItem todoItem) {
        return todoRepository.save(todoItem);
    }

    @Override
    public TodoItem add(TodoItem todoItem) {
        todoItem.setId(null);
        return todoRepository.save(todoItem);
    }
    @Override
    public void  delete(long id){
        get(id);
        todoRepository.deleteById(id);
    }


}
