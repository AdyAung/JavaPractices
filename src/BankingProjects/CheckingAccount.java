package BankingProjects;

public class CheckingAccount {
    public String name;
    private int balance;
    private String id;

    public CheckingAccount(String name, int balance, String id){
        this.name = name;
        this.balance = balance;
        this.id = id;
    }

    public void addFunds(int addingFund){
        balance += addingFund;
    }

    public void getInfo(){
        System.out.println("This checking account belongs to " + name + ". " +
                "It has "+ balance + " dollars in it. and ID is " + id);
    }
}
