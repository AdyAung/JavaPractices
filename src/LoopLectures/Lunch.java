package LoopLectures;

import java.util.ArrayList;

public class Lunch {

    public static ArrayList<String> removeAnts(ArrayList<String> lunchBox){
        for(int i = 0; i < lunchBox.size(); i++){
            if(lunchBox.get(i) == "Ant"){
                lunchBox.remove(lunchBox.get(i));
                i--;
            }
        }
        return lunchBox;
    }

    public static void main(String[] args) {
        ArrayList<String> lunchContainer = new ArrayList<>();

        lunchContainer.add("Apple");
        lunchContainer.add("Ant");
        lunchContainer.add("Ant");
        lunchContainer.add("Ant");
        lunchContainer.add("Sandwich");
        lunchContainer.add("Salad");
        lunchContainer.add("Ant");

        System.out.println(lunchContainer);

        lunchContainer = removeAnts(lunchContainer);
        System.out.println(lunchContainer);


    }
}
