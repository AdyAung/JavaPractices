package ChocolateCake;

public class Bakery {
    CupCake bakeryCupcake;
    double price;
    String giveTotal;

    public Bakery(CupCake bakeryCake, double cakePrice){

        /*
        CupCake copy = new CupCake(bakeryCake);
        bakeryCake = copy;*/


        this.price = cakePrice;
        bakeryCake.flavor = "Vanila";

        giveTotal = "The " + bakeryCake.flavor + " cupcake is $ " + price;
    }

    public static void main(String[] args) {
        CupCake chocolate = new CupCake("Chocolate", true);
        Bakery newCake = new Bakery(chocolate, 22);

        System.out.println(newCake.giveTotal);
        System.out.println(chocolate.flavor);
    }
}
