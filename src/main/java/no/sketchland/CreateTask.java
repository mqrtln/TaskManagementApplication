package no.sketchland;

import java.util.HashMap;
import java.util.Scanner;

public class CreateTask {
     public static Task createTask(Scanner in, HashMap map){
         int id = 0;
         System.out.println("Create a task: ");
         in.nextLine();
         System.out.println("Give it a name");
         String title = in.nextLine();
         System.out.println("Give it a description");
         String desc = in.nextLine();
         System.out.println("Give it a status ( 1): completed, 2) in progress, 3) done):");
         int status = in.nextInt();
         String statusString = inputThing(status);
         if(statusString.equals("Invalid")){
             System.out.println(ConsoleColors.RED + "Invalid input" + ConsoleColors.RESET);
             return null;
         } else {
             for(int i = 0; i < map.size(); i++){
                 id = map.size();
             }
             Task task = new Task(id, title, desc, statusString);
             System.out.printf("You've made a task with:\n title: %s\n description: %s\n status: %s\n", task.title, task.desc, statusString);

             return task;
         }
     }

    static String inputThing(int status){
        if(status == 1){
            return  "Completed";
        } else if(status == 2){
            return "In progress";
        } else if(status == 3){
            return "Done";
        } else {
            return "Invalid";
        }
    }
}
