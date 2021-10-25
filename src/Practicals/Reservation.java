package Practicals;

public class Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public Reservation(int count, int capacity, boolean open){
        if(count < 1 || count > 8){
            System.out.print("Invalid reservation!");
        }
        this.guestCount = count;
        this.restaurantCapacity = capacity;
        this. isRestaurantOpen = open;
    }

    public void confirmReservation(){
        if(restaurantCapacity >= guestCount && isRestaurantOpen){
            System.out.println("Reservation Confirmed");
            isConfirmed = true;
        }else{
            System.out.println("Reservation Denied");
            isConfirmed = false;
        }
    }

    public void informUser(){
        if(!isConfirmed){
            System.out.println("Unable to confirm reservation, please contact restaurant.");
        }else{
            System.out.println("Please enjoy your meal!");
        }
    }

    public static void main(String[] args) {
        Reservation partyOfThree = new Reservation(3, 12, true);

        partyOfThree.confirmReservation();
        partyOfThree.informUser();
    }





}
