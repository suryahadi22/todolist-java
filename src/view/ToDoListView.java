package view;

public class ToDoListView {
    public void showToDoList() {
        System.out.println("ToDo List");
        System.out.println("==========");
    }

    public void addToDoList(String todo) {
        System.out.println("Add ToDo List");
        System.out.println("==========");
        System.out.println("Todo: " + todo);
    }

    public void removeToDoList() {
        System.out.println("Remove ToDo List");
        System.out.println("==========");
    }
}
