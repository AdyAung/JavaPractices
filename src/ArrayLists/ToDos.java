package ArrayLists;

import java.util.ArrayList;

public class ToDos {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<String>();

        String toDo1 = "Playing Gym";
        String toDo2 = "Studying Java";
        String toDo3 = "Meeting";

        System.out.println(toDoList);

        toDoList.add(toDo1);
        toDoList.add(toDo2);
        toDoList.add(toDo3);

        System.out.println(toDoList);

        System.out.println(toDoList.get(1));
    }
}
