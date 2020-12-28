package com.todoexample.todoexample.repository;

import com.todoexample.todoexample.model.Todoitem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todoitem,Long> {

}
