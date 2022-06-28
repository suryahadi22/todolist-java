package repository;

import entity.ToDoList;

public interface ToDoListRepository {
    ToDoList[] getAll();

    void add(ToDoList todoList);

    boolean remove(Integer number);
}
