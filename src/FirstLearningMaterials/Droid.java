package FirstLearningMaterials;

public class Droid {
    /*
    2 states, name and battery level
    2 behaviours:
    Performing a task
    stating its battery level

     */

    String name;
    int batteryLevel;

    //Constructor method
    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;

    }

    public String toString(){
        return "Hello, I am the droid: " + name + " and my battery level is " + batteryLevel + "%";
    }

    public void performTask(String task){
        System.out.println(name + " performing task: " + task);
        batteryLevel = batteryLevel - 10;
        System.out.println("After performance, " + name + "\'s battery percentage is " + batteryLevel + "%");
    }

    public void energyReport(){
        System.out.println(name + " current battery level is " + batteryLevel + "%");

    }

    public void energyTransfer(Droid sender, Droid receiver, int transferEnergy){
        sender.batteryLevel = sender.batteryLevel - transferEnergy;
        receiver.batteryLevel = receiver.batteryLevel + transferEnergy;

        System.out.println("Transfering " + transferEnergy + " this much energy From " +
                sender.name + " to " + receiver.name);

    }


    public static void main(String[] args){
        Droid codey = new Droid("Codey");
        Droid maggot = new Droid("Maggot");

        System.out.println(codey);
        System.out.println(maggot);
        System.out.println("\n");

        codey.performTask("Dancing");
        maggot.performTask("Cleaning");
        System.out.println("\n");

        codey.energyReport();
        maggot.energyReport();
        System.out.println("\n");

        codey.energyTransfer(codey, maggot, 20);
        codey.energyReport();
        maggot.energyReport();

        maggot.energyTransfer(codey, maggot, 30);
        codey.energyReport();
        maggot.energyReport();


    }


}