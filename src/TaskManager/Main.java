package TaskManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager tm = new TaskManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== TASK MANAGER =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = sc.nextLine();
                    tm.addTask(title);
                    break;

                case 2:
                    tm.viewTasks();
                    break;

                case 3:
                    System.out.print("Enter task ID: ");
                    int id1 = sc.nextInt();
                    tm.markTaskCompleted(id1);
                    break;

                case 4:
                    System.out.print("Enter task ID: ");
                    int id2 = sc.nextInt();
                    tm.deleteTask(id2);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

