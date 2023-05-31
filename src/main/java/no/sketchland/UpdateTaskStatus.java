package no.sketchland;

import java.util.HashMap;
import java.util.Scanner;

import static no.sketchland.CreateTask.inputThing;

public class UpdateTaskStatus {
    public static void updateTaskStatus(Scanner in, HashMap<Integer, Task> map){
        System.out.println("Choose which task you want to change");
        int newOption = in.nextInt();
        if(map.containsKey(newOption)){
            map.forEach(
                    (key, value) -> {
                        if(key.equals(newOption)){
                            System.out.printf("value: %s, Title: %s, Desc: %s, Status: %s\n", value.id, value.title, value.desc, value.status);
                            System.out.println("Give it a status ( 1): completed, 2) in progress, 3) done):");
                            int status = in.nextInt();
                            String statusString = inputThing(status);
                            if(statusString.equals("Invalid")){
                                System.out.println(ConsoleColors.RED + "Invalid input" + ConsoleColors.RESET);
                            }
                            Task updatedTask = new Task(value.id, value.title, value.desc, statusString);
                            map.put(updatedTask.id, updatedTask);

                        }
                    }
            );
        }
    }
}
