package com.todo.todoservice.repository;

import com.todo.todoservice.entity.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
