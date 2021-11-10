package TestingExamples;

import java.util.ArrayList;

public class ShirtPrices {
    public static void main(String[] args) {
        ArrayList<Double> expenses = new ArrayList<Double>();

        expenses.add(74.46);
        expenses.add(63.99);
        expenses.add(10.57);
        expenses.add(81.37);

       double total = 0;

       for(int i = 0; i < expenses.size(); i++){
           double element = expenses.get(i);
           total += element;

       }
        System.out.println(total);

       double expensive = 0;
       for (double expense : expenses){
           if( expense > expensive ){
               expensive = expense;
           }
       }
        System.out.println("Expensive price: " + expensive);
    }
}
