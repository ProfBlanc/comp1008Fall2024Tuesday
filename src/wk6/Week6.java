package wk6;

import java.util.Scanner;

public class Week6 {
    public static void main(String[] args) {
        example6();
    }
    static void example1(){
        //attempt get a user number //except and error

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your student ID");
        int studentID = 0;
        try{
            //all numerical
            studentID = sc.nextInt();
            System.out.println("Your student ID is " + studentID);

        }
        catch (Exception e){
            //serr+tab => System.err.println();  => text in red
            System.err.println("Invalid student ID");

        }

    }
    static void example2(){
        //attempt get a user number //except and error

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your student ID");
        int studentID = 0;
        try{
            //all numerical
            studentID = sc.nextInt();

        }
        catch (Exception e){
            //serr+tab => System.err.println();  => text in red
            System.err.println("Invalid student ID");

        }
        System.out.println("Your student ID is " + studentID);

    }
    static void example3(){
        //attempt get a user number //except and error

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your student ID");
        int studentID = 0;
        String userInput = "";
        try{
            userInput = sc.nextLine();
            studentID = Integer.parseInt(userInput);

        }
        catch (Exception e){
            //serr+tab => System.err.println();  => text in red
            System.err.printf("The student ID of '%s' is invalid\n", userInput);

        }
        finally {
            System.out.println("Your student ID is " + studentID);
            sc = null;
        }

    }
    static void example4(){
        //attempt get a user number //except and error

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your student ID");
        int studentID = 0;
        String userInput = "";
        try{
            userInput = sc.nextLine();
            studentID = Integer.parseInt(userInput);

            if(userInput.trim().length() != 9){
                throw new IllegalArgumentException(
                        String.format("'%s' is not a valid student ID because it " +
                                "is not 9 digits", userInput)
                );
            }

            System.out.println("Half of your student number is "
                    + studentID / 2.0 );

        }
        catch (IllegalArgumentException e){
            System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
        catch (Exception e){
            //serr+tab => System.err.println();  => text in red
            System.err.printf("The student ID of '%s' is invalid\n", userInput);

        }
        finally {
            System.out.println("Your student ID is " + studentID);
            sc = null;
        }

//        throw new IllegalArgumentException("You fail, method");
            example5();
    }

    static void example5(){

        //throw new IllegalArgumentException("You fail, method");
        Integer.parseInt("abc");

    }

    static void example6(){
        try {
            Person p = new Person("Mr", 20);
            System.out.println(p);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
