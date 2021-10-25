package Projects;
/*
if you have money more than your car loan, you can pay full.
Or if do not have enough money, there is monthly payment with interest.
 */
public class CarLoan {
    public static void main(String[] args) {
        double carLoan = 1000;
        int loanLength = 3; //3years
        double interestRate = 5;  //5% interest rate
        double downPayment = 500;

        if(loanLength <= 0 || interestRate <= 0){
            System.out.println("Error! You must take out a valid car loan.");
        }else if(downPayment >= carLoan){
            System.out.println("The car can be paid in full.");
        }else{
            double remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            double monthlyBalance = remainingBalance / months;
            double interest = (monthlyBalance * interestRate) / 100;
            double monthlyPayment = monthlyBalance + interest;
            System.out.println("The monthly payment is: " + monthlyPayment);
        }
    }
}
