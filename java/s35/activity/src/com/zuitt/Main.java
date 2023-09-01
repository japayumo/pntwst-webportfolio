package com.zuitt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        User user1 = new User();
        Scanner nameScanner = new Scanner(System.in);

        System.out.println("What's your first name?");
        String firstName = nameScanner.nextLine();
        user1.setFirstName(firstName);

        System.out.println("What's your last name?");
        String lastName = nameScanner.nextLine();
        user1.setLastName(lastName);

        System.out.println("What's your contact number?");
        String contactNumber = nameScanner.nextLine();
        user1.setContactNumber(contactNumber);

        System.out.println("What's your email address?");
        String email = nameScanner.nextLine();
        user1.setEmail(email);

        System.out.println(user1.namePrinter());

        User user2 = new User("Jane", "Smith","jane@mail.com","0987654321", "");
        System.out.println(user2.namePrinter());
        System.out.println(user2.getId());



    } // void main
} // class Main
