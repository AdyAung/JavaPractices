package FirstLearningMaterials;

public class RaceCar {
    //Instance Fields
    String color;

    //Constructor Method
    public RaceCar (String carColor) {
        color = carColor;
    }

    //Non-Static Method (Behaviour)
    public void startEngine() {
        System.out.println("Starting the car!");
        System.out.println("Vroom!");
    }

    public static void main(String[] args) {
        RaceCar myFastCar = new RaceCar("Red");
        //Call a method on an object
        myFastCar.startEngine();
        System.out.println("That was one fast car and the color is " + myFastCar.color);
    }



}
