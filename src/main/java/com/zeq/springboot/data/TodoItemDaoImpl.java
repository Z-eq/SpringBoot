package com.zeq.springboot.data;

import com.zeq.springboot.entity.TodoItem;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;
@Repository

public class TodoItemDaoImpl implements ToDoITemDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<TodoItem> findById(String todoId) {
        return Optional.empty();
    }

    @Override
    public TodoItem save(TodoItem todoitem) {
        return null;
    }

    @Override
    public TodoItem update(TodoItem todoitem) {
        return null;
    }

    @Override
    public void remove(TodoItem todoitem) {

    }

    @Override
    public List<TodoItem> findAll() {
        return entityManager.createQuery("SELECT b from todo_item b", TodoItem.class).getResultList();
    }

    @Transactional(readOnly = true)
    @Override
    public List<TodoItem> findByTitle(String title) {
        return null;
    }

    @Override
    public List<TodoItem> findByDone(Boolean done) {
        return null;
    }
}
