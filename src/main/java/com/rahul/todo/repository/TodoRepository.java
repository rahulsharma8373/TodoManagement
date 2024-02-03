package com.rahul.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.todo.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
