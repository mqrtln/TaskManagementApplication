package no.sketchland;

import java.util.HashMap;
import java.util.Scanner;

public class ViewTasks {

    public static void viewTasks(Scanner in, HashMap<Integer, Task> map){
        map.forEach(
                (key, value)
                        -> System.out.printf("\n=====================\n Task no: %s\n Title: %s\n Description: %s\n Status: %s\n=====================\n", value.id, value.title, value.desc, value.status)
        );
    }
}
