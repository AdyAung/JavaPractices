package Practicals;

/*
Shipment
Shipping method
cost
order ready
 */

public class Order {
    String shipping;
    String coupCode;
    double cost;
    boolean isReady;

    public Order(String shipMethod,String discountCode, double costItems, boolean ready){
        if(costItems > 24){
            System.out.println("High value item!");
        }
        this.shipping = shipMethod;
        this.coupCode = discountCode;
        this.cost = costItems;
        this.isReady = ready;
    }

    public void ship(){
        if(isReady){
            System.out.println("Shipment is ready!");
            System.out.println("Shipping cost is " + calculateShipping());
        }
        else{
            System.out.println("Shipment is not read yet!");
        }
    }

    public double calculateShipping(){
        if(shipping.equals("Regular")){
            return 1.4;
        }
        else if(shipping.equals("Express")){
            if(coupCode.equals("Free Shipping")){
                return 0;
            }else if(coupCode.equals("Ship50")){
                return 1.0;
            }else{
                return 2.3;
            }
        }
        else{
            return 0.4;
        }

    }

    public static void main(String[] args) {
        Order ageis = new Order(" ", "", 44, true);

        ageis.ship();

    }
}