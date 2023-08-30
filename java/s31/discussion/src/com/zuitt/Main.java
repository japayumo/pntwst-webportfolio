/*
[Section] Packages and Classes
    - Classes are "blueprints" for creating objects and Java is known to be an Object-oriented Programming Language (OOP)
    - A package in Java is used to group related classes similar to how a folder is related to its files
*/
package com.zuitt;
// - Java package where the main/class belongs to

import java.util.Scanner;

/*
[Section] Main Class
    - The "Main" class is the entry point of Java program and is responsible for executing our code
    - Every program should have at least one "Main" class and one "main" function inside it
*/
public class Main {
    /*
    [Section] Main Function
        - This is where most of the executable code is applied to
        - Syntax:
            - public static void main(dataType argumentName){
                   // codes to be executed
            }
            - The "public" is an access modifier which tells out application what parts of the program can access the main function
            - The "void" is the return statement data type of the main function that defines what kind of data it will return. Since                there is no return statement and the main function returns nothing then the return data type is voided/is empty.
    */

    public static void main(String[] args){
        System.out.println("Hello World");

        // Variables
        /*
            - Variables in Java require the data type to the value to be specified
            - The variable names are called identifiers which commonly reference to when troubleshooting
            - Variables can be declared without an initial value
            - Syntax:
                Variable declaration:
                dataType identifier;

                Variable declaration and initialization:
                 dataType identifier = value;
        */

        // Variable Declaration
        int myNum;
        // System.out.println(myNum); // Error: java: variable myNum might not have been initialized

        // Initialization after declaration
        myNum = 1;
        System.out.println("Result of variable initialization after declaration:");
        System.out.println(myNum);

        // Variable Declaration and Initialization
        int mySecondNum = 29;
        System.out.println("Result of variable declaration and initialization:");
        System.out.println(mySecondNum);

        // Variable Reassignment
        mySecondNum = 30;
        System.out.println("Result of variable reassignment:");
        System.out.println(mySecondNum);

        // Constants
        // Naming convention for constants in Java is to use all uppercase letters
        final int PRINCIPAL = 1000;
            // PRINCIPAL = 200; // Error: Cannot assign a value to final variable 'PRINCIPAL'
        System.out.println("Result of constant/final variable:");
        System.out.println(PRINCIPAL);

        /*
        [Section] var Keyword and Local Scope
            - Automatic implication of data type
            - Has a local scope meaning it's only available to the function it was declared in
        */
        var unknown = "Hello";
        System.out.println(unknown);

        /*
        [Section] Primitive Data Types
            - Used to store simple values
            - For number values, each primitive data type can only store up to a certain value to maximize memory consumption
        */

        // Single quotes are used for characters
        char letter = 'A';
        boolean isMarried = false;

        byte students = 127;
        short seats = 32767;

        // Underscores may be placed in between numbers for code readability
        int localPopulation = 2_147_483_647;
        System.out.println("The current local population is: " + localPopulation);

        // Java recognizes whole numbers as integers and using the "L" denotes a long data type
        long worldPopulation = 7_862_081_145L;
        System.out.println(worldPopulation);

        // [Section] Floats and Decimals
        /*
            - Java recognizes decimals numbers as double and using the "F" suffix denotes a floating data type
            - The difference between the float and double depends on the preciseness of the values
            - Double have access to more decimal places making it more accurate
        */
        float price = 12.99F;
        System.out.println(price); // 12.99
        double temperature = 15683.8623941;
        System.out.println(temperature); // 15683.8623941

        // The "Object" class allows us to convert primitive data types into objects giving us access to the getClass method for checking data type of a           value
        System.out.println("Result of getClass Method: "); // Result of getClass Method:
        System.out.println(((Object)temperature).getClass()); // class java.lang.Double

        /*
        [Section] Non-Primitive / Referencing Data Types
        - Used to store complex data/objects
        - has access tp methods for manipulating data
        */

        String name = "John Doe";
        System.out.println("Result of Non-Primitive Data Types: ");
        System.out.println(name); // John Doe

        String editedName = name.toLowerCase();
        System.out.println(editedName); // john doe

        // Escape sequence
        System.out.println("C:\\Windows\\Desktop");

        // Getting type of data type
        System.out.println(name.getClass()); // class java.lang.String

        // [Section] Arithmetic Expressions
        int result = 10 + 5;
        System.out.println(result); // 15

        // [Section] Casting/Type Casting
        int num1 = 5;
        double num2 = 2.7;
        double total = num1 + num2;
        System.out.println("Result from implicit casting: ");
        System.out.println(total); // 7.7

        // int total2 = num1 + num2;
        // System.out.println(total2); // Error: java: incompatible types: possible lossy conversion from double to int

        // Explicit Type Casting
        int num3 = 5;
        double num4 = 2.7;
        int anotherTotal = num3 + (int)num4;
        System.out.println("Result from explicit casting: ");
        System.out.println(anotherTotal); // 7

        // Converting strings to integers
        // Most form data is received as a string
        String mathGrade = "90";
        String englishGrade = "85";
        System.out.println("Total grade is: " + mathGrade + englishGrade);

        // String to Integer
        int totalGrade = Integer.parseInt(mathGrade) + Integer.parseInt(englishGrade);
        System.out.println("Total grade is: " + totalGrade);

        // Integer to String
        String stringGrade = Integer.toString(totalGrade);
        System.out.println(stringGrade.getClass());

        // [Section] Scanner class
        /*
            - Used to get input from the user
            - Creates a "Scanner" object that allows access to multiple method for retrieving user input in the console.
            - Syntax:
                Scanner scannerName = new Scanner(System.in);
                scannerName.nextLine();
                scannerName,nextInt();
        */

        String myName;
        int myAge;

        // Instantiate a new Scanner object
        Scanner appScanner = new Scanner(System.in);

        // The nextLine() method of the scanner class will accept the whole next line of the user's input
        // The trim() method can be chained to the nextLine() method to remove spaces before and after the user's input

        System.out.println("What's your name? ");
        myName = appScanner.nextLine().trim();

        // The nextInt() method will accept the next integer of the user's input
        System.out.println("What's your age?");
        myAge = appScanner.nextInt();

        System.out.println("My name is: " + myName + ". I am " + myAge + " years old.");
    }

    public void hello(){
        // "unknown" and "myNum" are not recognized because they are declared in the "main" function and not in the "hello" function
        // System.out.println(myNum);
        // System.out.println(unknown);

    }
}
