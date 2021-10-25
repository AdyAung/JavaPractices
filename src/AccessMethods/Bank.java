package AccessMethods;

public class Bank {
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;

    public Bank(){
        this.accountOne = new CheckingAccount("Ady", 10000, 33);
        this.accountTwo = new CheckingAccount("Ma ji", 95000, 44);
    }


    public static void main(String[] args) {
        Bank bandOfCouple = new Bank();

        bandOfCouple.accountOne.getInformation();

        bandOfCouple.accountTwo.getInformation();


    }
}
