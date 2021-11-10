package PasswordChecking;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {


        int attempt = 0;

        Scanner password = new Scanner(System.in);
        System.out.println("Enter password: ");

        int myPassword = password.nextInt();
        //User password 777

        while(myPassword != 777 && attempt < 3){
            System.out.println("Try again");
            myPassword = password.nextInt();
            attempt += 1;

            if(attempt == 3){
                System.out.println("Invalid password. Wait 1 minutes");
            }
            if(myPassword == 777){
                System.out.println("Password Correct!");
            }

        }
    }
}
