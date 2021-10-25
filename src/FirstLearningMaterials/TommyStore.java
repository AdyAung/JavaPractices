package FirstLearningMaterials;

public class TommyStore {
    //Instant Fields
    String clothingType;
    int itemsCount;
    double itemsPrice;

    //Constructor Method
    public TommyStore(String type, int count, double price){
        //Values of parameters are Assigning to instant fields
        clothingType = type;
        itemsCount = count;
        itemsPrice = price;

    }

    public static void main(String[] args) {
        TommyStore longSleeveShirts = new TommyStore("Long Sleeve Shirts", 10, 88.44);

        TommyStore shortPants = new TommyStore("Short Pants", 14, 55.55);

        TommyStore boxer = new TommyStore("Boxers", 4, 22.66);

        System.out.println("Sydney's Tommy FirstLearningMaterials.Store has " + longSleeveShirts.itemsCount + " " +
                longSleeveShirts.clothingType + " and each sells at " + longSleeveShirts.itemsPrice + " per unit.");

        System.out.println("Brisbane's Tommy FirstLearningMaterials.Store has " + shortPants.itemsCount + " " +
                shortPants.clothingType + " and each sells at " + shortPants.itemsPrice + " per unit.");

        System.out.println("Melbourne's Tommy FirstLearningMaterials.Store has " + boxer.itemsCount + " " +
                boxer.clothingType + " and each sells at " + boxer.itemsPrice + " per unit.");
    }






}
