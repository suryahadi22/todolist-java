package test.view;


import repository.ToDoListRepository;
import repository.ToDoListRepositoryImpl;
import service.ToDoListService;
import service.ToDoListServiceImpl;
import view.ToDoListView;

public class ToDoListViewTest {
    public static void main(String[] args) {
        testShowToDoList();
    }

    public static void testShowToDoList() {
        ToDoListRepository toDoListRepository = new ToDoListRepositoryImpl();
        ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);
        ToDoListView toDoListView = new ToDoListView(toDoListService);

        toDoListService.addToDoList("Coba saja");
        toDoListService.addToDoList("Coba saja lagi");
        toDoListService.addToDoList("Coba saja lagi lagi");
        toDoListService.addToDoList("Coba saja lagi lagi lagi");

        toDoListView.showToDoList();
    }

    public static void testAddToDoList() {
        ToDoListRepository toDoListRepository = new ToDoListRepositoryImpl();
        ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);
        ToDoListView toDoListView = new ToDoListView(toDoListService);

        toDoListView.addToDoList();

        toDoListView.showToDoList();
    }

    public static void testRemoveToDoList() {
        ToDoListRepository toDoListRepository = new ToDoListRepositoryImpl();
        ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);
        ToDoListView toDoListView = new ToDoListView(toDoListService);

        toDoListService.addToDoList("Coba saja");
        toDoListService.addToDoList("Coba saja lagi");
        toDoListService.addToDoList("Coba saja lagi lagi");
        toDoListService.addToDoList("Coba saja lagi lagi lagi");

        toDoListService.showToDoList();

        toDoListView.removeToDoList();

        toDoListService.showToDoList();
    }
}
