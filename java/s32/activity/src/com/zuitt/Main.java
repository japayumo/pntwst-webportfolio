package com.zuitt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] fruitsArray = {"apple", "avocado", "banana", "kiwi", "orange"};
        System.out.println("Fruits in stock: " + Arrays.toString(fruitsArray));

        String myFruit;
        Scanner fruitScanner = new Scanner(System.in);

        System.out.println("Which fruit they would like the index of?");
        myFruit = fruitScanner.nextLine().trim().toLowerCase();
        // System.out.println("The index of " + myFruit + " is: " + Arrays.binarySearch(fruitsArray, myFruit));

        if(fruitsArray.toString().contains(myFruit)) {
            System.out.println("The index of " + myFruit + " is: " + Arrays.binarySearch(fruitsArray, myFruit));
        }
        else{
            System.out.println("Fruit is not in stock");
        }

        HashMap<String, String> userName = new HashMap<>();
        userName.put("firstName", "John");
        userName.put("lastName", "Smith");
        System.out.println("User A:");
        System.out.println(userName);

        HashMap<String, String> userName2 = new HashMap<>();
        userName2.put("firstName", "Jane");
        userName2.put("lastName", "Doe");
        System.out.println("User B:");
        System.out.println(userName2);

        System.out.println("Current Users:");
        ArrayList<HashMap> userDetails = new ArrayList<>(Arrays.asList(userName,userName2));
        System.out.println(userDetails);

        int userIndex;
        Scanner userScanner = new Scanner(System.in);

        System.out.println("What user id would you like to view the details?");
        userIndex = userScanner.nextInt();
        System.out.println(userDetails.get(userIndex-1));
        /*if(userIndex >= 0 || userIndex < userDetails.length()){
            System.out.println(userDetails.get(userIndex-1));
        }
        else{
            System.out.println("User is not in database");
        }*/



    }


}
