package TestingExamples;

import java.util.ArrayList;

public class ShirtPrices {
    public static void main(String[] args) {
        ArrayList<Double> expenses = new ArrayList<Double>();

        expenses.add(74.46);
        expenses.add(63.99);
        expenses.add(10.57);
        expenses.add(81.37);

        System.out.println(expenses.get(2));
    }
}
