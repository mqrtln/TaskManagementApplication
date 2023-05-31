package no.sketchland;

import java.util.HashMap;
import java.util.Scanner;

public class ViewTasks {

    public static void viewTasks(Scanner in, HashMap<Integer, Task> map){
        map.forEach(
                (key, value)
                        -> System.out.printf(" %s\n=====================\n%s Task no: %s\n Title: %s\n Description: %s\n Status: %s%s%s %s\n=====================\n%s", ConsoleColors.YELLOW, ConsoleColors.RESET, value.id, value.title, value.desc, ConsoleColors.GREEN, value.status, ConsoleColors.RESET, ConsoleColors.YELLOW, ConsoleColors.RESET)
        );
    }
}
