package FirstLearningMaterials;

public class Iphone {

    String name;
    int batteryLevel;

    public Iphone(String deviceName){
        name = deviceName;
        batteryLevel = 100;
    }

    public String toString(){
        return "This is " + name + " and battery percentage is " + batteryLevel + "%";
    }

    public void batteryPercentage(){
        System.out.println(name + " current battery percentage is " + batteryLevel + "%");
    }

    public void performTask(String task){
        System.out.println(name + " is " + task);
        batteryLevel = batteryLevel - 50;
        System.out.println("After performing " + task + ", current battery percentage is " + batteryLevel + "%");
    }

    public void energyTransfer(Iphone sender, Iphone receiver, int energyUnit){
        sender.batteryLevel = sender.batteryLevel - energyUnit;
        receiver.batteryLevel = receiver.batteryLevel + energyUnit;
        System.out.println("This device " + sender.name + " is charing " + energyUnit + "% into " +
                receiver.name);

    }

    public static void main(String[] args) {
        Iphone ady = new Iphone("Ady\'s FirstLearningMaterials.Iphone X");
        Iphone powerBank = new Iphone("Power bank");

        System.out.println(ady);
        System.out.println(powerBank);
        System.out.println("\n");

        ady.performTask("Watching Facebook");

        ady.energyTransfer(powerBank, ady, 40);
        ady.batteryPercentage();
        powerBank.batteryPercentage();
    }
}
