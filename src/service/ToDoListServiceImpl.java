package service;
import entity.ToDoList;
import repository.ToDoListRepository;

public class ToDoListServiceImpl implements ToDoListService{

    private ToDoListRepository todoListRepository;

    public ToDoListServiceImpl(ToDoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void showToDoList() {
        System.out.println("ToDo List");
        System.out.println("==========");
        ToDoList[] model = todoListRepository.getAll();

        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo.getTodo());
            }
        }
    }

    @Override
    public void addToDoList(String todo) {
        ToDoList toDoList = new ToDoList(todo);
        todoListRepository.add(toDoList);
        System.out.println("Successfully added ToDo List.");
    }

    @Override
    public void removeToDoList(Integer number) {
        boolean success = todoListRepository.remove(number);
        if (success) {
            System.out.println("Successfully removed ToDo List.");
        } else {
            System.out.println("Failed to remove ToDo List.");
        }
    }
}
