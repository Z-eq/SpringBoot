package com.zeq.springboot.data;

import com.zeq.springboot.entity.TodoItem;
import com.zeq.springboot.entity.TodoItem;

import java.util.List;
import java.util.Optional;

public interface ToDoITemDao {

    Optional <TodoItem> findById(String todoId);
    TodoItem save(TodoItem todoitem);
    TodoItem update(TodoItem todoitem);
    void remove(TodoItem todoitem);
    List<TodoItem> findAll();
    List<TodoItem> findByTitle(String title);
    List<TodoItem> findByDone(Boolean done);




}
