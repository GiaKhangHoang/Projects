import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    private ArrayList<String> tasks;
    private Scanner scanner;

    public TaskManager() {
        tasks = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addTask() {
        System.out.print("Enter a new task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added!");
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
            return;
        }
        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public void removeTask() {
        viewTasks();
        if (tasks.isEmpty()) {
            return;
        }
        System.out.print("Enter the number of the task to remove: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;
        if (index >= 0 && index < tasks.size()) {
            String removed = tasks.remove(index);
            System.out.println("Removed task: " + removed);
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public void run() {
        while (true) {
            System.out.println("\nTask Manager Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1": addTask(); break;
                case "2": viewTasks(); break;
                case "3": removeTask(); break;
                case "4": 
                    System.out.println("Exiting Task Manager. Goodbye!");
                    return;
                default: 
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.run();
    }
}