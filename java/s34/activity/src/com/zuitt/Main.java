package com.zuitt;

import java.util.Scanner;

public class Main {
    static void geloMethod(){
            Scanner codeScanner = new Scanner(System.in);

            System.out.println("Choose an exception to handle: ");
            System.out.println("[1] Arithmetic, [2] NullPointer, [3] NumberFormat, [4] ArrayIndexOutOfBounds, [5] GeloException");
            int choice = codeScanner.nextInt();

            switch (choice) {
                case 1:
                    // Arithmetic Exception
                    try {
                        System.out.println(47 / 0);
                    } catch (ArithmeticException e) {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;
                case 2:
                    // NullPointer Exception
                    String myString = null;

                    try {
                        System.out.println(myString.length());
                    } catch (NullPointerException e) {
                        System.out.println("Cannot get the length of null");
                    }
                    break;
                case 3:
                    // NumberFormat Exception
                    String myOtherString = "hello";

                    try {
                        System.out.println(Integer.parseInt(myOtherString));
                    } catch (NumberFormatException e) {
                        System.out.println("Cannot parse non-numerical values");
                    }
                    break;
                case 4:
                    // ArrayIndexOutOfBounds Exception
                    String[] myWords = {"Hello", "World"};

                    try {
                        System.out.println(myWords[2]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Cannot get element of index that does not exist");
                    }
                    break;
                case 5:
                    // GeloException
                    // int num = 10;
                    try {
                        // if(num == 10)
                        throw new GeloException("GeloException was thrown ");
                    } catch (GeloException e) {
                        System.out.println(e);
                    }
            // switch
            }
        // geloMethod()
        }
// Main
};

public static void main(String[] args){
    geloMethod();
};


class GeloException extends Exception{
    public GeloException(String message){
        super(message);

    }
}