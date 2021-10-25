package LoopLectures;
import java.util.ArrayList;
import java.util.Arrays;

public class PrimeDetectives {

    public boolean isPrime(int number){
        if( number == 2){
            System.out.println("The smallest prime number");
            return true;
        }else if(number < 2){
            System.out.println("It is not prime");
            return false;
        }

        for(int i = 2; i < number; i++){
            if(number % i == 0){
                System.out.println("It is not prime.");
                return false;
            }
        }
        System.out.println("It is prime");
        return true;

    }

    public ArrayList<Integer> onlyPrimes(int[] numbers){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int number : numbers){
            if ( isPrime(number)){
               primes.add(number);
            }
        }
        return primes;

    }

    public static void main(String[] args) {
        PrimeDetectives pd = new PrimeDetectives();

        int[] num =  {6, 29, 28, 33, 11, 100, 101, 43, 89};

        System.out.println(pd.isPrime(0));
        System.out.println(pd.onlyPrimes(num));


    }
}

/*
More Questions
Build a method that filters an array for odd or even numbers (bonus points if it can do either depending on arguments passed in!).
Build a method that returns an ArrayList of the first n primes in an array.
Build a method that returns an ArrayList of the first n Fibonacci numbers.
 */