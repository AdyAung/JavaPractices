package Practicals;

public class Car{
    String color;

    public Car(String carColor){
        color = carColor;
    }

    public static void main(String[] args) {
        Car myCar = new Car("Red");

        System.out.println(myCar);
    }

    public String toString(){
        return "This is a " + color + " car!";
    }
}