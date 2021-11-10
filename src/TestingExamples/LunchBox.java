package TestingExamples;

import java.util.ArrayList;

public class LunchBox {

    public static ArrayList<String> removeAnts (ArrayList<String> lunchBox){
        for(int i=0; i < lunchBox.size(); i++){
            if(lunchBox.get(i) == "ant"){
                lunchBox.remove(lunchBox.get(i));
                i--;
            }
        }
        return lunchBox;
    }

    public static void main(String[] args) {
        ArrayList<String> lunchContainer = new ArrayList<>();

        lunchContainer.add("apple");
        lunchContainer.add("ant");
        lunchContainer.add("ant");
        lunchContainer.add("sandwich");
        lunchContainer.add("ant");

        System.out.println("The lunch box with ants: " + lunchContainer);
        lunchContainer = removeAnts(lunchContainer);
        System.out.println("The lunch box without ants: " + lunchContainer);

    }
}
