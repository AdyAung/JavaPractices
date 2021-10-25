package LoopLectures;

import java.util.ArrayList;

public class CalculateTotal {
    public static void main(String[] args) {

        ArrayList<Double> expenses = new ArrayList<Double>();

        expenses.add(44.0);
        expenses.add(55.6);
        expenses.add(33.4);
        expenses.add(66.7);

        double total = 0;

       for(int i=0; i < expenses.size(); i++){
           total += expenses.get(i);
           System.out.println(total);

       }
        System.out.println("Total: " + total);

    }
}
