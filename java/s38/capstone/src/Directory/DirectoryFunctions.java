package Directory;

import java.util.Scanner;
import java.util.ArrayList;

public class DirectoryFunctions {
    Database importDatabase = new Database();

    Scanner directoryScanner = new Scanner(System.in);
    ArrayList<Database> subscriberArray = SubscriberDatabase.subscriberArray;

    public void searchContact() {
        System.out.println();
        System.out.println("You selected search contact");
        System.out.println();

        SubscriberDatabase subscriberDatabase = new SubscriberDatabase();
        String searchTerm = "";

        while(searchTerm.isBlank()){
            System.out.print("Enter name or number you want to search: ");
            searchTerm = directoryScanner.nextLine().trim().toLowerCase();
        }

        ArrayList<Database> filteredUser = new ArrayList<>();
        for(Database subscriber : subscriberArray) {
            if(subscriber.getFirstName().toLowerCase().contains(searchTerm) || subscriber.getLastName().toLowerCase().contains(searchTerm)) {
               filteredUser.add(subscriber);
            }
        }

        if(filteredUser.isEmpty()){
            System.out.println("No user found.");
        }
        else{
            System.out.println("The following users were found: ");
            for (Database filteredUserData : filteredUser) {
                System.out.println("\nName: " + filteredUserData.getFirstName() + " " + filteredUserData.getLastName() + "\nNumber: " + filteredUserData.getContactNumber() + "\nAddress: " + filteredUserData.getAddress());
            }
        }
    }//searchContact()
    public void viewContact() {
        System.out.println();
        System.out.println("You selected view contact");
        System.out.println();
        for(Database subscriber : subscriberArray) {
            System.out.println("First Name: " + subscriber.getFirstName());
            System.out.println("Last Name: " + subscriber.getLastName());
            System.out.println("Phone Number: " + subscriber.getContactNumber());
            System.out.println("Address: " + subscriber.getAddress());
            System.out.println();
        }
    }//viewContact()
    public void addContact() {
        System.out.println();
        System.out.println("You selected add contact");
        System.out.println();

        System.out.print("Enter first name: ");
        String newFirstName = directoryScanner.nextLine();
        importDatabase.setFirstName(newFirstName);

        System.out.print("Enter last name: ");
        String newLastName = directoryScanner.nextLine();
        importDatabase.setLastName(newLastName);

        System.out.print("Enter contact number: ");
        String newContactNumber = directoryScanner.nextLine();
        importDatabase.setContactNumber(newContactNumber);

        System.out.print("Enter address: ");
        String newAddress = directoryScanner.nextLine();
        importDatabase.setAddress(newAddress);

        Database newUserData = new Database(newFirstName, newLastName, newContactNumber, newAddress);
        SubscriberDatabase.subscriberArray.add(newUserData);

        System.out.println("Contact added successfully");


    }//addContact()
    public void editContact(){
        while(true){
            System.out.print("Enter the first name of the contact you want to modify: ");
            String firstNameToEdit = directoryScanner.nextLine();
            boolean userFound = false;
            for (int i = 0; i < subscriberArray.size(); i++) {
                if (subscriberArray.get(i).getFirstName().equalsIgnoreCase(firstNameToEdit)) {

                    System.out.print("Enter first name: ");
                    String newFirstName = directoryScanner.nextLine();
                    importDatabase.setFirstName(newFirstName);

                    System.out.print("Enter last name: ");
                    String newLastName = directoryScanner.nextLine();
                    importDatabase.setLastName(newLastName);

                    System.out.print("Enter contact number: ");
                    String newContactNumber = directoryScanner.nextLine();
                    importDatabase.setContactNumber(newContactNumber);

                    System.out.print("Enter address: ");
                    String newAddress = directoryScanner.nextLine();
                    importDatabase.setAddress(newAddress);

                    Database updateUserData = new Database(newFirstName, newLastName, newContactNumber, newAddress);
                    SubscriberDatabase.subscriberArray.set(i, updateUserData);

                    System.out.println("Contact updated successfully");
                    return;
                }
            }
                if(!userFound)
                    System.out.println("User not found");

                System.out.println("Do you want to continue edit process?\n[1] - Yes\n[2] - No");
                String response = directoryScanner.nextLine();
                if(response.equals("2")) {
                    break;
                }
        }
    }//editContact()

    public void deleteContact() {
        boolean userFound = false;
        while(true) {
            System.out.print("Enter the first name of the contact that you want to delete: ");
            String firstNameToDelete = directoryScanner.nextLine();

            for (int i = 0; i < SubscriberDatabase.subscriberArray.size(); i++) {
                Database contact = SubscriberDatabase.subscriberArray.get(i);


                if (contact.getFirstName().equalsIgnoreCase(firstNameToDelete)) {
                    SubscriberDatabase.subscriberArray.remove(i);
                    System.out.println("Contact deleted successfully!");
                    return;
                }
            }
            if (!userFound)
                System.out.println("Contact not found.");

            System.out.println("Do you want to continue delete process?\n[1] - Yes\n[2] - No");
            String response = directoryScanner.nextLine();
            if (response.equals("2")) {
                break;
            }
        }
    }//deleteContact()


}//class DirectoryFunctions