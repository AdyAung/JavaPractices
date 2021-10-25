package FirstLearningMaterials;

public class Starbucks {
    String productType;

    public Starbucks(String product){
        productType = product;

    }

    public void menu(){
        String message = "Starbuck is Selling " + productType +"!";
        System.out.println(message);
    }

    public static void main(String[] args) {
        String coffee = "Cappuccino";

        Starbucks coffeeShop = new Starbucks(coffee);
        coffeeShop.menu();


    }
}
