package view;

import service.ToDoListService;
import util.InputUtil;

public class ToDoListView {
    private ToDoListService toDoListService;

    public ToDoListView(ToDoListService toDoListService) {
        this.toDoListService = toDoListService;
    }

    public void showToDoList() {
        while (true) {
            toDoListService.showToDoList();
            System.out.println("----------------------------------------");
            System.out.println("1. Show ToDoList");
            System.out.println("2. Add ToDoList");
            System.out.println("3. Remove ToDoList");
            System.out.println("x. Exit");
            System.out.print("Select number: ");
            var option = InputUtil.inputSelection("Select number: ");
            switch (option) {
                case "1":
                    showToDoList();
                    break;
                case "2":
                    addToDoList();
                    break;
                case "3":
                    removeToDoList();
                    break;
                case "x":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Selection");
                    break;
            }
        }
    }

    public void addToDoList() {
        System.out.println("Add ToDo List");
        System.out.println("==========");
        System.out.println("Todo (x for cancel): ");
        var todo = InputUtil.inputString("ToDo: ");
        if (todo.equals("x")) {
            return;
        } else {
            toDoListService.addToDoList(todo);
        }
    }

    public void removeToDoList() {
        System.out.println("Remove ToDo List");
        System.out.println("==========");
        System.out.println("Number (x for cancel): ");
        var number = InputUtil.inputSelection("Number: ");
        if (number.equals("x")) {
            return;
        } else {
            toDoListService.removeToDoList(Integer.parseInt(number));
        }
    }
}
