package wk2;

import java.util.Random;
import java.util.Scanner;

public class Week2 {

    //psvm+tab
    public static void main(String[] args) {
        example5();
    }

    static void example1(){

        /*
        Primitive (integral aka numerical)
            int byte float  double  boolean short long char

        Reference (non-integral aka non-numerical)
            String
         */


        /*
        type-casting
            converting one data type to another
         */

        int a = 100;
        long b = a;  //implicity aka promotion aka smaller to bigger

        short c = (short)a;  //explicit aka demotion aka bigger to smaller

        int d = 130;
        byte e = (byte) d ;  //-128        127
        /*
                int     127     128     129     130
                byte    127     -128    -127    -126
         */
        byte f = (byte) (d * -1) ;  //-128        127


        long g = 1000; // is this promotion aka implicit type-casting

        long h = 100L;
    }

    static void example2(){

        /*
                    if(boolean_expression){
                        //statements to run if true
                    }
                    else if (boolean_expression){
                        //statements to run if true
                    }
                    else{
                    }
         */

        /*
        ask the user to enter their total purchase price
        ask the user for their age
            if user is within 18-25, apply a 10% discount to price
            if user is over 65, apply a 25% discount
        output to the screen
            total price
            discount taken off of price
            total with discount applied
            output the tax (13%)
            output the grand total (price - discount, plus tax)
         */
        Scanner input = new Scanner(System.in);
        System.out.println("What is the total price?");
        double totalPrice = input.nextDouble();
        System.out.println("Enter your age");
        int age = input.nextInt();
        double discount = 100;
        if(age >= 18 && age <= 25)
            discount -=10;
        else if(age >= 65)
            discount -= 25;

        double discountPrice = totalPrice - (totalPrice * (discount/100));
        double tax = (totalPrice - discountPrice) * 0.13;
        double totalBeforeTax = totalPrice - discountPrice;
        double grandTotal = totalBeforeTax + tax;

        System.out.printf("Total Purchase = %.2f\nDiscount=%.2f" +
                "\nTotal Before Tax=%.2f\nTax=%.2f\nGrand total=%.2f", totalPrice, discountPrice,
                totalBeforeTax,tax,grandTotal);



    }
    static void example3(){

        //do-while loop: runs at least once
        //post-condition iteration structure

        //continually ask the user for an odd number

        int number = 0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Enter a number");
            number = input.nextInt();
            if(number % 2 == 0)
                System.out.println("Number " + number + " is even. Please enter an odd number");

        }while(number % 2 == 0);

        System.out.println("Thank you for entering an odd number");
        System.out.println("The number you inputted was " + number);

    }

    static void example4(){

        /*
                continually ask user for a number between 1 & 10
                until they have correctly guessed the number
         */
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(1, 11);
        int userGuess = 0;
        while(true){

            System.out.println("Enter a number");
            userGuess = input.nextInt();
            if(userGuess == numberToGuess){
                System.out.println("Congrats! You correctly guessed the number");
                break;
            }
            else if(userGuess < numberToGuess){
                System.out.println("Guess higher");
            }
            else{
                System.out.println("Guess lower");
            }
        }

    }

    static void example5(){

        /*
            Ask the user two numbers.
            Count up from lowest number to highest number,
            increasing by a random int value between 1 and 3
         */

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int increase = random.nextInt(1, 4);

        System.out.println("Enter first number");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number");
        int secondNumber = input.nextInt();

        int start, end;

        start = firstNumber <= secondNumber ? firstNumber : secondNumber;

        //coniditional opoerator aka ternary operator
        // boolean_expression ? statementIfTrue : statementIfFalse

        if(firstNumber <= secondNumber){
            start = firstNumber;
        }
        else{
            start = secondNumber;
        }

        end = Math.max(firstNumber, secondNumber);

        for(int i = start; i <= end; i+=increase){
            System.out.println(i);
        }

    }


}
