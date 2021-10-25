package Projects;
/*
Laptop loan monthly payment with the if else statements
 */
public class LaptopLoan {
    public static void main(String[] args) {
        double laptopLoan = 3000;
        //2 years loan length
        int loanLength = 2;
        //interest rate is 2%
        double interestRate = 15;
        double downPayment = 1000;

        if(loanLength <= 0 || interestRate <= 0){
            System.out.println("Error! Invalid laptop loan purchase.");

        }else if(downPayment >= laptopLoan){
            System.out.println("You can buy your laptop now! Congrats!");

        }else{
            System.out.println("I am sorry that you have to pay for monthly payment.");
            System.out.println("Here is the plan for you: ");

            double remainingBalance = laptopLoan - downPayment;
            int months = loanLength * 12;
            double monthlyBalance = remainingBalance / months;
            double interest = (monthlyBalance * interestRate)/100;
            double monthlyPayment = monthlyBalance + interest;

            System.out.println("The monthly payment without the interest is " + monthlyBalance);
            System.out.println("The monthly payment with the interest is " + monthlyPayment);
        }

    }


}
