package no.sketchland;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class DeleteTask {
    public static void deleteTask(Scanner in, HashMap<Integer, Task> map){
        System.out.println("Please enter which task you want to delete");
        int deleteOption = in.nextInt();

        Iterator<Map.Entry<Integer, Task>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Task> entry = iterator.next();
            if (entry.getKey() == deleteOption) {
                iterator.remove(); // Safely remove the entry using the iterator
                System.out.println("Task deleted successfully");
            } else {
                System.out.println(ConsoleColors.RED + "Invalid input" + ConsoleColors.RESET);
            }

        }
    }
}
