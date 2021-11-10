package TestingExamples;

import java.util.Random;
import java.util.Scanner;

public class RollDice {
    public static void main(String[] args) {

        int diceCount = 0;
       // int number = 5;

        Random randomNumber = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Pick up your dice numbers: ");
        int userDice = scan.nextInt();
        int diceRoll = randomNumber.nextInt(6) + 1;

        while (diceRoll != userDice){
            System.out.println(diceRoll);
            diceRoll = randomNumber.nextInt(6) + 1;
            diceCount += 1;

            if(diceRoll == userDice){
                System.out.println("It takes " + diceCount + " times to get " + userDice);
            }


        }
    }
}
