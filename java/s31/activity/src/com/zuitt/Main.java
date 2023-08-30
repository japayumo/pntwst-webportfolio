package com.zuitt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String firstName;
        String lastName;
        double firstSubject;
        double secondSubject;
        double thirdSubject;


        Scanner gradeScanner = new Scanner(System.in);

        System.out.println("First Name: ");
        firstName = gradeScanner.nextLine().trim();

        System.out.println("Last Name: ");
        lastName = gradeScanner.nextLine().trim();

        System.out.println("First Subject Grade: ");
        firstSubject = gradeScanner.nextDouble();

        System.out.println("Second Subject Grade: ");
        secondSubject = gradeScanner.nextDouble();

        System.out.println("Third Subject Grade: ");
        thirdSubject = gradeScanner.nextDouble();

        int gradeAverage = ((int)firstSubject + (int)secondSubject + (int)thirdSubject ) / 3;
        //int intGradeAverage = gradeAverage;

        System.out.println("Good day " + firstName + " "+ lastName + ". Your average grade is: " + gradeAverage);


    }
}

