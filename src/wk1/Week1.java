package wk1;

import java.util.Scanner;

public class Week1 {
    //psvm+tab
    public static void main(String[] args) {
        /*
        Ask user for a number
        Ask user for a symbol
        Ask user for another number
        Output the result
         */
        //create variables
        double num1, num2;
        String symbol;

        Scanner input = new Scanner(System.in);

        //sout+tab
        System.out.println("Enter number 1");
        num1 = input.nextDouble();
        input.nextLine(); // don't worry. but needed
        System.out.println("Enter symbol");
        symbol = input.nextLine();
        System.out.println("Enter number 2");
        num2 = input.nextDouble();

        //souf_tab
        System.out.printf("%.1f %s %.1f = %.1f",
                num1, symbol, num2, num1 + num2);

        System.out.println(num1 + symbol + num2 + " = " + (num1 + num2));
    /*
        %+data type
            %s  string
            %d for whole number - int, short, long, byte, etc
            %f for decimal number   float, double %.percisionf
     */

    }

}
