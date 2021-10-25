package Practicals;

public class OnlineShop {
    String shipping;
    double cost;
    boolean isReady;

    public OnlineShop(String shipMethod, double costItems, boolean ready){
        if(costItems > 20){
            System.out.println("High Value item!");
        }
        this.shipping = shipMethod;
        this.cost = costItems;
        this.isReady = ready;

    }

    public void ship(){
        if(isReady){
            System.out.println("Shipment is Ready!");
            System.out.println("Shippping cost is " + calculateShipping());
        }else{
            System.out.println("Shipment is not ready yet!");
        }
    }

    public double calculateShipping(){
        double cost;

        switch (shipping){
            case "Regular":
                cost = 1.9;
                break;
            case "Express":
                cost = 3.5;
                break;
            default:
                cost = 0.5;
        }
        return cost;
    }

    public static void main(String[] args) {
        OnlineShop clothes = new OnlineShop("Express", 40, true);

        clothes.ship();
    }
}
