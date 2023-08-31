package com.zuitt;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner appScanner = new Scanner(System.in);

        /*System.out.println("Input a number");
        int num = appScanner.nextInt();
        System.out.println("The number you entered is " + num);*/

        // [Section] Try-Catch-Finally
        /*
            - Syntax:
                try{
                    // code to test
                }
                catch(ExceptionClass errorParameter){
                    // code to execute
                }
                finally{
                }
        */

        /*int num = 0;

        try{
            System.out.println("Input a number");
            num = appScanner.nextInt();
        }
        catch(InputMismatchException e){
            // Handle the case where the input doesn't match the expected data type
            System.out.println("THe value provided is not an integer");
            // System.out.println(e); // java.util.InputMismatchException
            // e.printStackTrace(); // used to check the error
        }
        catch (Exception e){
            // Exception is used to catch any type of exception. It can catch any error
            System.out.println("Error");
            System.out.println(e); // java.util.InputMismatchException
        }
        finally {
            // Code to run with or without error
            // With or without error, finally executes/run
            // System.out.println("Sample Text");
            if(num != 0){
                System.out.println("The number you entered is: " + num);
            }
        };*/

       /* appScanner.nextLine();
        double decimal = 0;

        try{
            System.out.println("Input a decimal number: ");
            decimal = appScanner.nextDouble();
        }
        catch(InputMismatchException e){
            System.out.println("The value provided is not a decimal number");
        }
        catch(Exception e){
            System.out.println("Error");
            System.out.println(e);
        }
        finally {
            System.out.println("The decimal number you entered is " + decimal);
            System.out.println("This code runs with or w/o error");
        }*/

        // nextLine()
        // \n or Enter denotes a new line which is recognized in the input
        /*String string = appScanner.nextLine();
        System.out.println(string);*/

        // solution
        /*appScanner.nextLine(); // Receiver \n or Enter
        System.out.println("Enter a string"); // hello world
        String string = appScanner.nextLine();
        System.out.println(string); // hello world

        // next()
        // Will only capture the next token and not a string with spaces
        System.out.println("Enter a string"); // hello world
        String string2 = appScanner.next();
        System.out.println(string2); // hello*/

        /*try{
            System.out.println("Give me a number but not 9");
            int userInput = appScanner.nextInt();
            if(userInput == 9){
                throw new NewException("Your number provided is 9", appScanner);
                // We use the "throws" keyword to indicate what exceptions will be encountered and handled accordingly when                                invoked/called in the "main" method
            }
        }
        catch(NewException e){
            System.out.println(e);
        }*/

        try{
            System.out.println("Give me a name: ");
            String userInput = appScanner.nextLine().toLowerCase();
            if(userInput.equals("admin")){
                                    // exception message
                throw new NewException("Name handled through NewException", appScanner);
            }
        }
        catch (NewException e){
            System.out.println(e); // "e" here represents the caught NewException instance, in our context since the exception message is provided as argument for NewException, it will display the message once NewException is finished.
        }

    // void main end
    }
// Main end
}

/*
class NewException extends Exception{
    public NewException(String message, Scanner appScanner){
        super(message);
        System.out.println("Give me another number");
        int myNum = appScanner.nextInt();
        System.out.println(myNum);
    }
}*/

class NewException extends Exception{
    public NewException(String message, Scanner appScanner){
        super(message); // message here is the message provided in System.out.println(message)
        System.out.println("Are you  sure this is your name?");
        System.out.println("Type y if you are sure");
        String reply = appScanner.nextLine().toLowerCase();
        if(!reply.equals("y")){
            System.out.println("Provide a new name, restart the program");
        }
    }
};