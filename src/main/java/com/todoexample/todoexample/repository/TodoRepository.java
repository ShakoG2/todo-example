package com.todoexample.todoexample.repository;

import com.todoexample.todoexample.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service
public interface TodoRepository extends JpaRepository<TodoItem,Long> {

}
