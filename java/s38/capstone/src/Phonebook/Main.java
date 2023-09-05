package Phonebook;

import java.util.Scanner;
import Directory.*;

public class Main {
    public static void main(String[] args) {

        /*Scanner transactionScanner = new Scanner (System.in);
        String transaction1 = "";
        while(transaction1.isBlank() || (!transaction1.equals("1") && !transaction1.equals("2") && !transaction1.equals("0"))) {
            System.out.println("Hello! Welcome to the Philippine National Phone Directory.");
            System.out.println("[1] - Open Directory \n[2] - Display Emergency Numbers \n[0] - Cancel Transaction");
            System.out.print("Please select your transaction: ");
            transaction1 = transactionScanner.nextLine();

            while (!transaction1.equals("1") && !transaction1.equals("2") && !transaction1.equals("0")) {
                System.out.println();
                System.out.println("Invalid option. Please try again.");
                System.out.println("[1] - Open Directory\n[2] - Display Emergency Numbers\n[0] - Cancel Transaction");
                System.out.print("Please select your transaction: ");
                transaction1 = transactionScanner.nextLine();
            }

            while (transaction1.equals("2")){
                System.out.println();
                System.out.println(" ====== Emergency Numbers ===== ");
                System.out.println();
                System.out.println("National Emergency Number: 911 \nPhilippine National Police: 117 \nBureau of Fire Protection: 160 \nDepartment of Health: 1555 \nBantay Bata: 163 \nMMDA: 136");
                System.out.println();
                System.out.println("Do you want to select another transaction? \n[1] - Yes \n[2] - No");
                String extraTransaction = transactionScanner.nextLine();
                while(extraTransaction.isBlank()){
                    System.out.print("Do you want to select another transaction? \n[1] - Yes \n[2] - No");
                    extraTransaction = transactionScanner.nextLine();
                }
                if(extraTransaction.equals("1"))
                    break;
                else {
                    System.out.println("Ending transaction. Have a great day");
                    return;
                }
            }
        }

        ArrayList<Database> subscribers = new ArrayList<>(SubscriberDatabase.subscriberArray);

        if(transaction1.equals("1")) {
            System.out.println();
            System.out.println("Opening Directory");
            System.out.println();
            SubscriberDatabase subscriberDatabase = new SubscriberDatabase();
            subscriberDatabase.displaySubscriberArray();
        }
        else if (transaction1.equals("2")) {

        }
        else if (transaction1.equals("0")){
            System.out.println("Ending transaction. Have a great day");
            return;
        }*/

        Scanner transactionScanner = new Scanner(System.in);
        String transaction1 = "";

        while (true) {
            System.out.println();
            System.out.println("Hello! Welcome to the Philippine National Phone Directory.");
            System.out.println("[1] - Open Directory\n[2] - Display Emergency Numbers\n[0] - Cancel Transaction");
            System.out.print("Please select your transaction: ");
            transaction1 = transactionScanner.nextLine();

            if(transaction1.equals("1")) {
                System.out.println();
                System.out.println("You selected Open Directory.");

            while(true){
                System.out.println("\n[1] - Search Contact\n[2] - View Contact\n[3] - Add Contact\n[4] - Update/Edit Contact\n[5] - Delete Contact\n[0] - Cancel Transaction");
                System.out.print("Please select your transaction: ");
                String extraTransaction1 = transactionScanner.nextLine();

                DirectoryFunctions directoryFunctionsInvoke = new DirectoryFunctions();
                SubscriberDatabase subscriberDatabase = new SubscriberDatabase();

                //searchContact
                while(true){
                    if(extraTransaction1.equals("1")) {
                       directoryFunctionsInvoke.searchContact();
                    }
                    break;
                }//searchContact

                //viewContact
                while(true){
                    if(extraTransaction1.equals("2")) {
                       directoryFunctionsInvoke.viewContact();
                    }
                    break;
                }//viewContact

                //addContact
                while(true){
                    if(extraTransaction1.equals("3")) {
                        directoryFunctionsInvoke.addContact();
                    }
                    break;
                }//addContact

                //editContact
                while(true){
                    if(extraTransaction1.equals("4")) {
                        directoryFunctionsInvoke.editContact();
                    }
                    break;
                }//editContact

                //deleteContact
                while(true){
                    if(extraTransaction1.equals("5")) {
                        directoryFunctionsInvoke.deleteContact();
                    }
                    break;
                }//deleteContact

                while(extraTransaction1.isBlank() || (!extraTransaction1.equals("1")) && (!extraTransaction1.equals("2")) && (!extraTransaction1.equals("3")) && (!extraTransaction1.equals("4")) && (!extraTransaction1.equals("5")) && (!extraTransaction1.equals("0"))){
                    System.out.println("Invalid option. Try again");
                    break;
                }

                if(extraTransaction1.equals("0")) {
                    System.out.println("Cancelling transaction. Returning to Home.");
                    break;
                }
            }

            }//option 1

            else if(transaction1.equals("2")) {
                  while (true) {
                    System.out.println();
                    System.out.println(" ====== Emergency Numbers ====== ");
                    System.out.println();
                    System.out.println("National Emergency Number: 911 \nPhilippine National Police: 117 \nBureau of Fire Protection: 160 \nDepartment of Health: 1555 \nBantay Bata: 163 \nMMDA: 136");
                    System.out.println();
                    System.out.println("Do you want to select another transaction? \n[1] - Yes \n[2] - No");
                    String extraTransaction2 = transactionScanner.nextLine();
                    while (extraTransaction2.isBlank()) {
                        System.out.print("Do you want to select another transaction? \n[1] - Yes \n[2] - No");
                        extraTransaction2 = transactionScanner.nextLine();
                    }
                    if (extraTransaction2.equals("1")) {
                        break;
                    } else if (extraTransaction2.equals("2")) {
                        System.out.println("Ending transaction. Have a great day.");
                        return;
                    } else {
                        System.out.println("Invalid option. Please try again.");
                    }
                }
            }//option 2

            else if(transaction1.equals("0")) {
                System.out.println("Canceling transaction. Have a great day.");
                return;
            }//option 0
            else{
                System.out.println("Invalid option. Please try again.");
            }//invalid transaction
        }
    }//void main
}//class Phonebook.Main
