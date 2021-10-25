package AccessMethods;

public class CheckingAccount {
    private String name;
    private int balance;
    private int id;
    private double interestRate;

    public CheckingAccount(String inputName, int inputBalance, int inputId){
        this.name = inputName;
        this.balance = inputBalance;
        this.id = inputId;
        this.interestRate = 0.02;
    }

    private int getBalance(){
        return this.balance;
    }

    public void getInformation(){
        System.out.println("Money in account : " + this.getBalance());
        System.out.println("Next Month's Interest: " + this.calculateNextMonthInterest() );
    }

    private double calculateNextMonthInterest(){
        return this.balance * this.interestRate;
    }



}
