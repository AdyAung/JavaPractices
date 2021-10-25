package ArraysLectures;

import java.util.Arrays;

public class Restaurant {
    public void printSpecials(){
        String[] specials = {"Chicken Fried Rice", "Soup", "Fried Chicken"};
        System.out.println("Special dishes are " + Arrays.toString(specials));
    }

    public static void main(String[] args) {
        Restaurant chickenDish = new Restaurant();

        chickenDish.printSpecials();



    }
}
