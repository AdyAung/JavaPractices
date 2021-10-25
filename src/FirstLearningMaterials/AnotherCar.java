package FirstLearningMaterials;

public class AnotherCar {
    String color;
    int milesDriven;

    public AnotherCar (String carColor) {
        color = carColor;
        milesDriven = 0;
    }

    public void drive(){
        String message = "Miles Driven: " + milesDriven;
        System.out.println(message);
    }

    public static void main(String[] args) {
        AnotherCar fastCar = new AnotherCar("Red");
        fastCar.drive();
    }
}
