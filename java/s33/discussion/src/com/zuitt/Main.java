package com.zuitt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
            [Section] Conditional statements
                - Help control the flow of the program
                - The curly braces ({}) are also optional if only a single statement will be executed and must be used in conjunction with                                       proper indention to ensure code readability
                - For multiple statement execution, using curly braces will be required and is better for code readability
        */

        int num1 = 10;
        int num2 = 20;

        // If statement
        if(num1 > 5)
            System.out.println("Num1 is greater than 5"); // Num1 is greater than 5

        // If-Else statement
        if(num2 > 100)
            System.out.println("Num2 is greater than 100");
        else
            System.out.println("Num2 is less than or equal to 100"); // Num2 is less than or equal to 100

        // If-ElseIf-Else statements
        if(num2 > 100)
            System.out.println("Num2 is greater than 100");
        else if(num2 < 100)
            System.out.println("Num2 is less than 100"); // Num2 is less than 100
        else
            System.out.println("Num2 is equal to 100");

        // Using boolean values with conditional statement
        boolean isPogi = true;

        if(isPogi)
            System.out.println("Pogi, bili ka na"); // Pogi, bili ka na

        // [Section] Logical AND (&&), OR (||), and NOT (!) Operators
        boolean isMarried = false;
        boolean isRetired = true;

        // All expressions must be true (AND)
        if(isMarried == false && isRetired == false)
            System.out.println("You are a devote member of society"); // No output

        // At least one expression is true (OR)
        if(isMarried || isRetired )
            System.out.println("Thank you for your service!"); // Thank you for your service!

        // (NOT) Reverses the boolean value
        if(!isMarried || isRetired )
            System.out.println("You have lived a wonderful life"); // You have lived a wonderful life

        // [Section] String comparison
        /*
            - In Java, comparing strings can be done using "equals" method instead of using equality operator like in other languages
        */
        String word = "hello";

        // ==, to check if two variables point ot hte same memory location, it doesn't cae about the content of the strings.
        // strings with the same content are often stored in the same memory location to optimize memory usage
        if (word == "hello")
            System.out.println("hi"); // hi

        // equals method .equals()
        // to compare if two strings have the same characters
        if (word.equals("hello"))
            System.out.println("hi"); // hi

        // blank method .isBlank()
        // Checks if the string is blank or contains whitespace

        String blank = "   ";
        System.out.println("Result of is blank Method");
        System.out.println(blank.isBlank()); // true

        // isEmpty()
        // Checks ONLY if the string has a length of 0
        String empty = "   ";
        System.out.println("Result of is isEmpty Method");
        System.out.println(empty.isEmpty()); // false
        System.out.println(empty.length()); // 3

        // [Section] Short Circuiting
        /*
            - When using logical operators in Java, when an expression is found to be true, Java will short circuit and will not continue to evaluate other                expressions
            - The code may seem correct and will still function, however, errors will not be captured until encountered which will cause problems during                    development
        */

        int x = 15;
        int y = 0;

        // System.out.println(x/y); // Exception in thread "main" java.lang.ArithmeticException: / by zero at com.zuitt.Main.main(Main.java:93)

        // The second condition "x/y == 0" will never return an error because of short-circuiting
        // Even though the error produced by "x/y" will return an error was used twice, the application will run as intended
        // "y > 5" will always be false given our example, thus "x/y == 0" will not be evaluated and the code block inside will never run
        if(y > 5 && x/y == 0)
            System.out.println("Result is " + x/y);
        else
            System.out.println("The condition has short circuit"); // The condition has short circuit

        // [Section] Switch statement
        Scanner appScanner = new Scanner(System.in);

        /*System.out.println("Provide a number between 1 to 4");
        int directionValue = appScanner.nextInt();
        System.out.println("Result of switch statement:");*/

       /* switch(directionValue) {
            case 1:
                System.out.println("North");
                break;

            case 2:
                System.out.println("South");
                break;

            case 3:
                System.out.println("West");
                break;

            case 4:
                System.out.println("East");
                break;

            default:
                System.out.println("Invalid");
        }*/

        // Enhanced Switch Statement (Java 13)
        // Avoids problems when "break" statement is forgotten
        /*switch (directionValue) {
            case 1 -> System.out.println("North");
            case 2 -> System.out.println("South");
            case 3 -> System.out.println("East");
            case 4 -> System.out.println("West");
            default -> System.out.println("Invalid");
        }*/

        /*System.out.println("Choose a number between 1 to 5");
        int option = appScanner.nextInt();

        switch (option){
            case 1, 2 -> System.out.println("The option is < 3");
            case 4, 5 -> System.out.println("The option is > 3");
            default -> System.out.println("The option is 3 or a number not in option");
        }*/

        /*System.out.println("Choose an option between 0 and 1");
        int choice = appScanner.nextInt();

        // Allows use of switch statement as an expression and return values of the "yield" statement
        String response = switch(choice){
            case 0:
                yield "false";
            case 1:
                yield "true";
            default:
                yield "Incorrect response";
        };

        System.out.println(response);*/

        // [Section] Loops
        // for loops
        for(int i = 0; i <= 5; i++){
            System.out.println("Current value: " + i);
        };
        /*
            Current value: 0
            Current value: 1
            Current value: 2
            Current value: 3
            Current value: 4
            Current value: 5
        */

        int[] intArray = {1000,2000,3000,4000,5000};
        for(int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        };
        /*
            1000
            2000
            3000
            4000
            5000
        */

        // ForEach loops with arrays
        String[] nameArray = {"John", "Paul", "George"};
        for(String name:nameArray){
            System.out.println(name);
        };
        /*
            John
            Paul
            George
        */

        // ForEach loops with ArrayLists
        ArrayList<String> disneyCharacters = new ArrayList<>(Arrays.asList("Ursula", "Maleficent", "Vanelope"));
        for(String character:disneyCharacters){
            System.out.println(character);
        };
        /*
            Ursula
            Maleficent
            Vanelope
        */
                                    // row // column
        String[][] classroom = new String[3][3];

        // First Row
        classroom[0][0] = "Baki";
        classroom[0][1] = "Boruto";
        classroom[0][2] = "Sakura";

        // Second Row
        classroom[1][0] = "Courage";
        classroom[1][1] = "Finn";
        classroom[1][2] = "Ogie";

        // Third Row
        classroom[2][0] = "Harris";
        classroom[2][1] = "Jacob";
        classroom[2][2] = "Khan";

        for(int row=0; row < 3; row++){
            for(int col=0; col < 3; col++){
                System.out.println(classroom[row][col]);
            }
        };
        /*
            Baki
            Boruto
            Sakura
            Courage
            Finn
            Ogie
            Harris
            Jacob
            Khan
        */

        // While loop
        /*for(int i = 0; i <= 5; i++){
            System.out.println("Current value: " + i);
        };*/

        int i = 0;
        while(i<=5){
            System.out.println("Current value: " + i);
            i++;
        };
        /*
            Current value: 0
            Current value: 1
            Current value: 2
            Current value: 3
            Current value: 4
            Current value: 5
        */

        // Do while Loop
        int b = 5;
        do{
            System.out.println("Countdown: " + b);
            b--;
        }
        while(b>=10);
        // Countdown: 5

        // While loop with user input
        String name = "";

        /*while(name.isBlank()){
            System.out.println("What's your name? Type goodbye to exit");
            name = appScanner.nextLine().toLowerCase();

            if(name.equals("goodbye")){
                System.out.println("See you later!");
            }
            else if(!name.isBlank()){
                System.out.println("Hi " + name);
            }
        };*/

        while(name.isBlank()){
            System.out.println("What's your name? Type goodbye to exit");
            name = appScanner.nextLine().toLowerCase();

            if(name.equalsIgnoreCase("goodbye")){
                System.out.println("See you later!");

            /*if(name.trim().equalsIgnoreCase("goodbye".trim())){
                System.out.println("See you later!");
            }*/
            else if(!name.isBlank()){
                System.out.println("Hi " + name);
            }
        }
















    }
}
