package wk3;

import java.util.Random;
import java.util.Scanner;

public class Week3 {

    public static void main(String[] args) {

        example3();
    }
    static void example3(){

        //create a guessing, asking user to guess a number between 1 and 10
        //limit to 3 guesses
        //store the user guesses into an array

        //if user guesses a number that they have previously guessed, don't count the guess
        Random random = new Random();
        int numberToGuess = random.nextInt(1, 11);
        int maxNumberOfGuesses = 3;
        int[] userGuesses = new int[maxNumberOfGuesses];
        Scanner input = new Scanner(System.in);
        int trackUserGuesses = 0;

        while(true){
            System.out.println("Enter a number");
            int userGuess = input.nextInt();
            if(userGuess == numberToGuess){
                System.out.println("You guessed the number " + numberToGuess);
            }
            else{
                //check if number exists in the array (userGuesses)
                //if yes, not count the guess. if not, count the guess
            }


            //stop the loop if: 1) user correctly guesses number 2) user reached maxGuessAmount
        }
    }
    static void example1(){
        Person p = new Person();
        p.setDob("Ben 01,2000");
        System.out.println(p.getDob());

    }
    static void example2(){
        String[] dow = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        double[] temperatures = new double[5];
        temperatures[0] = 100;
        temperatures[1] = 200;

        for(int i = 2; i < temperatures.length; i++){
            temperatures[i] = new Random().nextDouble(10, 31);
        }


    }
}
