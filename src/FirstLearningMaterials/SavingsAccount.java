package FirstLearningMaterials;

public class SavingsAccount {
    //Instance Fields
    double balance;

    //Constructor Method
    public SavingsAccount(double initialBalance){
        this.balance = initialBalance;
    }

    //Check balance
    public void checkBalance(){
        System.out.println("Hello!");
        System.out.println("Your balance is " + balance);
    }

    //Deposit method
    public double deposit(double amountToDeposit){
        double afterDeposit = balance + amountToDeposit;
        balance = afterDeposit;
        System.out.println("I deposited " + amountToDeposit + " dollars.");
        return amountToDeposit;
    }

    //Withdraw method
    public double withdraw(double amountToWithdraw){
        double afterWithdrew = balance - amountToWithdraw;
        balance = afterWithdrew;
        System.out.println("I withdrew " + amountToWithdraw + " dollars.");
        return amountToWithdraw;

    }

    public static void main(String[] args) {
        SavingsAccount adyAccount = new SavingsAccount(2000);

        adyAccount.checkBalance();
        adyAccount.deposit(4000);
        adyAccount.withdraw(2300);
        System.out.println("Now I have " + adyAccount.balance);



    }


}