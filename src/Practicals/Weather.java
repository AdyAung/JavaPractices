package Practicals;

public class Weather {
    public static void main(String[] args) {
        int temp = 45;
        boolean raining = false;

        if(temp < 60){
            System.out.println("Bring your jacket");
            if(raining == true){
                System.out.println("Bring your umbrella");
            }else{
                System.out.println("Leave your umbrella at home, you wear a jacket already.");
            }
        }
    }
}
