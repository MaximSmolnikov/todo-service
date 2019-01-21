package com.todo.todoservice;

import com.todo.todoservice.entity.Task;
import com.todo.todoservice.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.stream.Stream;

@Service
public class DataInitializer {
    @Autowired
    private TaskRepository taskRepository;

    @PostConstruct
    public void init() {
        Stream.of(
                new Task(1L, "asd", false),
                new Task(2L, "asd", false))
                .forEach(task -> taskRepository.save(task));
    }
}
