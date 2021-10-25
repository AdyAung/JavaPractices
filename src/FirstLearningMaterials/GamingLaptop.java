package FirstLearningMaterials;

public class GamingLaptop {
    String productType;

    public GamingLaptop(String product){
        productType = product;
    }

    public void playingGame(String actionGame, String platforms, double playHours) {
        System.out.println("I am playing " + actionGame + " on " + platforms + ".");
        System.out.println("It took bloody " + playHours + "!");
        System.out.println("It was enjoyable journey.");
    }

    public static void main(String[] args) {
        GamingLaptop personCon = new GamingLaptop("MSI");
        personCon.playingGame("Red Dead Redemption", "MSI Laptop", 35.40);
        System.out.println("My laptop name is " + personCon.productType);
    }
}
