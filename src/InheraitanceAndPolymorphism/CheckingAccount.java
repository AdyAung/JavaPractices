package InheraitanceAndPolymorphism;

public class CheckingAccount extends Bank{
    public CheckingAccount(double balance){
        super(balance);
    }

    @Override
    public void printBalance() {
        System.out.println("Your checking account balance is $" + balance);
    }

    public void checkingBalacne(){
        printBalance();  //Print from checkingAccount class
        super.printBalance(); //Print from Bank class
        System.out.println("Thank you ");
    }
}
