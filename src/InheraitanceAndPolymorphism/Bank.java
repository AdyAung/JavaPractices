package InheraitanceAndPolymorphism;

public class Bank {
    protected double balance;

    public Bank(double balanceIn){
        this.balance = balanceIn;

    }

    public void printBalance(){
        System.out.println("Your account balance is $" + balance);
    }

    public static void main(String[] args) {
        Bank myBank = new Bank(2000.3);

        Bank maji = new CheckingAccount(4000.4);

        maji.printBalance();
    }
}
