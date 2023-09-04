package Phonebook;


import java.util.ArrayList;
import java.util.Scanner;
import Directory.*;

public class Main {
    public static void main(String[] args) {


        Scanner transactionScanner = new Scanner (System.in);
        String transaction1 = "";
        /*while(transaction1.isBlank()) {
            System.out.println("Hello! Welcome to the Philippine National Phone Directory.");
            System.out.println("[1] - Open Directory \n[2] - Display Emergency Numbers \n[0] - Cancel Transaction");
            System.out.print("Please select your transaction: ");
            transaction1 = transactionScanner.nextLine();
        }

        switch (transaction1){
            case "1":
                System.out.println("Opening Directory");
                break;
            case "2":
                System.out.println(" ====== Emergency Numbers ===== ");
                System.out.println("National Emergency Number: 911 \nPhilippine National Police: 117 \nBureau of Fire Protection: 160 \nDepartment of Health: 1555 \nBantay Bata: 163 \nMMDA: 136");
                break;
            case "0":
                System.out.println("Ending transaction. Have a great day");
                break;
        }*/


        /*if(transaction1.equals("0")){
            transactionScanner.nextLine();
            System.out.println("Do you wish to proceed with another transaction? [1] - Yes [2] - No");
            String extraTransaction = transactionScanner.nextLine();
        }*/

        System.out.println(subscriberArr);


    }//void main
    public static Object displayArray(){
        ArrayList<Database> subscriberArr = new ArrayList<>();
        subscriberArr.addAll(SubscriberDatabase.subscriberArray);
    }
}//class Phonebook.Main
