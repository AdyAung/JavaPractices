package FirstLearningMaterials;

public class Store {
    String productType;
    double price;

    //Constructor method
    public Store(String product, double initialPrice){
        this.productType = product;
        this.price = initialPrice;
    }

    //to Increase method
    public void increasedPrice(double priceToAdd){
        double newPrice = priceToAdd + price;
        price = newPrice;
    }

    //price with tax method
    public double priceWIthTax(){
        double tax = 0.07;
        double totalPrice = price + price * tax;
        return totalPrice;
    }

    public static void main(String[] args){
        Store lemonadeStand = new Store("Lemonade", 3.5);
        Store cookieShop = new Store("Cookies", 5 );

        System.out.println(lemonadeStand);
        System.out.println(cookieShop);

    }

    public String toString(){
        return "This store sells " + productType + " at a price of " + price;
    }
}