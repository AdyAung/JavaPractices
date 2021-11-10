package TestingExamples;

import java.util.ArrayList;

public class ArrayNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(null);
        numberList.add(null);

        for(int i=0; i < numberList.size(); i++){
            int num = numberList.get(i);
            numberList.add(num + 1);

        }
        System.out.println(numberList);


    }
}
