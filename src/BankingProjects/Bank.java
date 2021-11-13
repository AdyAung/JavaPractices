package BankingProjects;

public class Bank {
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;

    public Bank(){
        accountOne = new CheckingAccount("Lala", 300000, "69");
        accountTwo = new CheckingAccount("Kazuma", 2, "99");
    }

    public static void main(String[] args) {
        Bank konSuba = new Bank();

        konSuba.accountOne.getInfo();
        konSuba.accountTwo.addFunds(300);
        konSuba.accountTwo.getInfo();
        System.out.println(konSuba.accountOne.name);
    }
}
