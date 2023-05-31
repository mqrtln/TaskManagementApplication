package no.sketchland;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

import static no.sketchland.CreateTask.inputThing;

public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        AtomicBoolean isGoing = new AtomicBoolean(true);
        HashMap<Integer, Task> savedTasks = new HashMap<>();


        while (isGoing.get()) {
            System.out.println("Choose an option:\n 1) Create a new task\n 2) Display existing tasks\n 3) Update task status\n 4) Delete a task\n 5) Exit ");
            int option = in.nextInt();
            if (option == 1) {
                Task newTask = CreateTask.createTask(in, savedTasks);
                if (newTask != null) {
                    savedTasks.put(newTask.id, newTask);
                } else {
                    continue;
                }
            }
            if (option == 2) {
                ViewTasks.viewTasks(in, savedTasks);
            }
            if (option == 3) {
                ViewTasks.viewTasks(in, savedTasks);
                UpdateTaskStatus.updateTaskStatus(in, savedTasks);
            }
            if (option == 4) {
                ViewTasks.viewTasks(in, savedTasks);
                DeleteTask.deleteTask(in, savedTasks);
            }
                if (option == 5) {
                    System.out.println("Exiting...");
                    isGoing.set(false);
                }

            }

        }
    }