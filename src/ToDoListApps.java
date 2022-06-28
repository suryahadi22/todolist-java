import repository.ToDoListRepository;
import repository.ToDoListRepositoryImpl;
import service.ToDoListService;
import service.ToDoListServiceImpl;
import view.ToDoListView;

public class ToDoListApps {
    public static void main(String[] args) {
        showToDoList();
    }

    public static void showToDoList() {
        ToDoListRepository toDoListRepository = new ToDoListRepositoryImpl();
        ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);
        ToDoListView toDoListView = new ToDoListView(toDoListService);

        toDoListService.addToDoList("Coba saja");
        toDoListService.addToDoList("Coba saja lagi");
        toDoListService.addToDoList("Coba saja lagi lagi");
        toDoListService.addToDoList("Coba saja lagi lagi lagi");

        toDoListView.showToDoList();
    }

}
