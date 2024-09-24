package wk4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Week4 {

    public static void main(String[] args) {

        //myCourseSchedule();
        guessingGame();
        Course c = new Course();
        c.myMethod();

        Course gradCourse = Course.graduateCourse();
    }

    static void guessingGame(){
        /*
            ask the user to guess a number between 1 and 20.
            ask until they correctly guess the number
            output higher or lower as hint
            give feedback if they already guessed a previously-guessed
            at the end, output their incorrect guesses
         */

        //what objects do we need?
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(1, 21);
        int userGuess = 0;
        //track incorrect guesses
        ArrayList<Integer> incorrectGuesses = new ArrayList<>();
        System.out.println("Guess a number between 1 and 20");
        do{
            System.out.printf("Enter guess %d: ", incorrectGuesses.size() + 1);
            userGuess = sc.nextInt();

            if(userGuess == numberToGuess){
                System.out.println("Congratulations! You guessed the correct number!");
            }
            else if(incorrectGuesses.contains(userGuess)){
                    System.out.println("You already guessed " + userGuess);
                }
            else{
                    System.out.printf("Your guess is too %s. You need to guess %s\n",
                            userGuess < numberToGuess ? "low" : "high",
                            userGuess < numberToGuess ? "higher" : "lower"

                            );
                    incorrectGuesses.add(userGuess);
            }


        }
        while(userGuess != numberToGuess);

        System.out.printf("It took you %d guesses to correctly guess the number %d\n",
                incorrectGuesses.size() + 1, numberToGuess
                );

        System.out.println("Each is the list of your incorrect guesses");
        for(int guess: incorrectGuesses){
            System.out.println(guess);
        }

    }
    static void workingWithArrayList(){

        //dynamic array
        //not fixed size
        //methods available to: add, update, delete, read


        //ArrayList<Expected_Data_Type>
        // needs to be a reference data type

        //int, double, etc...not allowed?
        //reference/class-wrappers for all primitive data types

        //int => Integer
        //capitalize the first letter

        //import the java.util.ArrayList

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        Integer value = 2;
        list.remove(value);
        list.remove(0);

        list.add(1, 123);  //insert at a specified index

        list.set(0, 987); // update

        System.out.println(list.get(1));

        list.contains(89479275);

        list.size(); //get the number of items



    }
    static void myCourseSchedule(){
            /*
                    Mon                 Tues                Wed

                    python              java                database
                    co-op               c++                 brain theory
                    calculus
             */

        String[][] courses = new String[3][];

        courses[0] = new String[]{"python", "co-op", "calculus"};
        courses[1] = new String[]{"java", "c++"};
        courses[2] = new String[]{"database", "brain theory"};

        for(int i = 0; i < courses.length; i++){

            for(int j = 0; j < courses[i].length; j++){
                System.out.println(courses[i][j]);
            }

        }

    }
    static void workingWidth2DArrays1(){
/*
        {
            1,
            2,
            3,
        }

        {
            {},
            {},
            {}
        }
        */

        int[][] numnums1 = new int[3][3];

        int[][] numsnums2 = {
                {1,2,3},
                {2,4,6}
        };

        numnums1[0][1] = 123;
        /*
                    Col 0       Col 1       Col 2
        Row 0                   123
        Row 1
        Row 2


         */

        for(int rows = 0; rows < numnums1.length; rows++){

            for(int cols = 0; cols < numnums1[rows].length; cols++){
                System.out.println(numnums1[rows][cols]);
            }

        }

        ///jagged array: not all columns have same length

        int[][] numnums2 = new int[3][];

        numnums2[0] = new int[2];
        numnums2[1] = new int[5];
        numnums2[2] = new int[9];

    }



}
