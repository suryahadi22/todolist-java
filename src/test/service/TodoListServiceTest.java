package test.service;

import entity.ToDoList;
import repository.ToDoListRepository;
import repository.ToDoListRepositoryImpl;
import service.ToDoListService;
import service.ToDoListServiceImpl;

public class TodoListServiceTest {
    public static void main(String[] args) {
//        testShowToDoList();
//        testAddToDoList();
        testRemoveToDoList();
    }

    public static void testShowToDoList() {
        ToDoListRepositoryImpl toDoListRepository = new ToDoListRepositoryImpl();
        toDoListRepository.data[0] = new ToDoList("Coba saja");
        toDoListRepository.data[1] = new ToDoList("Coba saja lagi");
        toDoListRepository.data[2] = new ToDoList("Coba saja lagi lagi");
        toDoListRepository.data[3] = new ToDoList("Coba saja lagi lagi lagi");

        ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);

        toDoListService.showToDoList();
    }

    public static void testAddToDoList() {
        ToDoListRepositoryImpl toDoListRepository = new ToDoListRepositoryImpl();

        ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);

        toDoListService.addToDoList("Coba saja");
        toDoListService.addToDoList("Coba saja lagi");
        toDoListService.addToDoList("Coba saja lagi lagi");
        toDoListService.addToDoList("Coba saja lagi lagi lagi");

        toDoListService.showToDoList();
    }

    public static void testRemoveToDoList() {
        ToDoListRepositoryImpl toDoListRepository = new ToDoListRepositoryImpl();

        ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);

        toDoListService.addToDoList("Coba saja");
        toDoListService.addToDoList("Coba saja lagi");
        toDoListService.addToDoList("Coba saja lagi lagi");
        toDoListService.addToDoList("Coba saja lagi lagi lagi");
        toDoListService.addToDoList("Coba saja lagi lagi lagi lagi");
        toDoListService.addToDoList("Coba saja lagi lagi lagi lagi lagi");

        toDoListService.showToDoList();
        toDoListService.removeToDoList(3);
        toDoListService.removeToDoList(2);
        toDoListService.showToDoList();
        toDoListService.removeToDoList(1);
        toDoListService.showToDoList();
    }
}
