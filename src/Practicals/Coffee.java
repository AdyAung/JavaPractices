package Practicals;

public class Coffee {
    public Coffee(){

    }
    public void addSugar(int sugarCubes){
        System.out.println("Added " + sugarCubes + " Sugar in my coffee.");
    }

    public static void main(String[] args) {
        Coffee morningCoffee = new Coffee();

        Coffee eveningCoffee = new Coffee();

        morningCoffee.addSugar(8);

        eveningCoffee.addSugar(4);


    }
}

