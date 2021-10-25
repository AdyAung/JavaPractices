package AccessMethods;

public class ATM {
    //Static Variables
    public static int totalMoney = 0;
    public static int numATMs = 0;   //number of ATMs

    //Instance Variables
    public int money;

    //Constructor method
    public ATM(int inputMoney){
        this.money = inputMoney;

        numATMs += 1;
        totalMoney += inputMoney;
    }

    public void withdrawMoney(int amountToWithdraw){
        if(amountToWithdraw <= this.money){
            this.money -= amountToWithdraw;
            totalMoney -= amountToWithdraw;
        }
    }

    public static void main(String[] args) {
        System.out.println("Total number of ATMs before: " + ATM.numATMs);

        ATM firstATM = new ATM(2000);
        ATM secondATM = new ATM(1000);

        System.out.println("Total number of ATMS after: " + ATM.numATMs);

        System.out.println("Total number of Money in all ATMs: " + ATM.totalMoney);
        firstATM.withdrawMoney(500);
        secondATM.withdrawMoney(300);

        System.out.println("Total Number of ATMs after withdraw: " + ATM.numATMs);
        System.out.println("Total number of Money in all ATMs after withdraw: " + ATM.totalMoney);


    }
}
