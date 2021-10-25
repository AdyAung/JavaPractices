package FirstLearningMaterials;

public class ClassicCar {
    String color;

    public ClassicCar(String carColor) {
        color = carColor;
    }

    public void startRadio(double stationNum, String stationName){
        System.out.println("Turning on the radio to " + stationNum + ", "
        + stationName + "!");
        System.out.println("Enjoy!");
    }

    public static void main(String[] args) {
        ClassicCar myCar = new ClassicCar("Red");
        myCar.startRadio(112.40, "Gym Station");
    }
}
