package com.zuitt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /* Leap Year*/
        Scanner codeScanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = codeScanner.nextInt();

        if((year%4 == 0 && year%100 != 0) || year%400 == 0)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is NOT a leap year");
        /* End of Leap Year*/


        /* Array List */
        ArrayList<String> userArray = new ArrayList<>(Arrays.asList("Mickey", "Donald", "Goofy", "Minnie", "Daisy"));
        ArrayList<String> filteredUser = new ArrayList<>();
        String searchTerm = "";
        Scanner charScanner = new Scanner(System.in);

        System.out.println(userArray);
        // String searchTerm = codeScanner.nextLine().trim().equalsIgnoreCase();

        while(searchTerm.isBlank()){
            System.out.println("Enter character you want to select:");
            searchTerm = charScanner.nextLine().trim().toLowerCase();
        }

        for (String character : userArray){
            if(character.contains(searchTerm)){
                    filteredUser.add(character);
            }
        }
        // if(!(searchTerm.isBlank())){
            if(filteredUser.size() == 0){
                System.out.println("No character found");
            }
            else{
                System.out.println("The following users were found: ");
                System.out.println(filteredUser);
            }





        /* End of Array List*/












    }
}

