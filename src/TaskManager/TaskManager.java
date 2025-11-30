package TaskManager;

import java.io.*;
import java.util.*;

public class TaskManager {
    private ArrayList<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    public TaskManager() {
        loadTasksFromFile();
    }

    public void addTask(String title) {
        tasks.add(new Task(nextId++, title));
        System.out.println("Task added successfully!");
        saveTasksToFile();
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("\n---- All Tasks ----");
        for (Task t : tasks) {
            System.out.println(t);
        }
    }

    public void markTaskCompleted(int id) {
        for (Task t : tasks) {
            if (t.getId() == id) {
                t.markCompleted();
                System.out.println("Task marked as completed!");
                saveTasksToFile();
                return;
            }
        }
        System.out.println("Task not found!");
    }

    public void deleteTask(int id) {
        Iterator<Task> itr = tasks.iterator();
        while (itr.hasNext()) {
            if (itr.next().getId() == id) {
                itr.remove();
                System.out.println("Task deleted!");
                saveTasksToFile();
                return;
            }
        }
        System.out.println("Task not found!");
    }

    public void saveTasksToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("tasks.txt"))) {
            for (Task t : tasks) {
                bw.write(t.getId() + "," + t.getTitle() + "," + t.isCompleted());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving tasks.");
        }
    }

    public void loadTasksFromFile() {
        File file = new File("tasks.txt");
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String title = data[1];
                boolean completed = Boolean.parseBoolean(data[2]);

                Task t = new Task(id, title);
                if (completed) t.markCompleted();

                tasks.add(t);

                if (id >= nextId) nextId = id + 1;
            }
        } catch (Exception e) {
            System.out.println("Error loading tasks.");
        }
    }
}

