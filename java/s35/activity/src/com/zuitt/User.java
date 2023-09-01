package com.zuitt;


public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String contactNumber;
    private String Id;

    public User(){
    }

    public User (String firstName, String lastName, String email, String contactNumber, String Id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contactNumber = contactNumber;
        this.Id = Id;

    }

    // Getter
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getContactNumber(){
        return this.contactNumber;
    }
    public String getId(){
        return this.Id;
    }


    // Setter
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setContactNumber(String contactNumber){
        this.contactNumber = contactNumber;
    }

    public String namePrinter(){
        return "Hello my name is " + getFirstName() + " " + getLastName() + "\nYou may contact me at " + getContactNumber() + " or you may email me at " + getEmail();
    }

} // class User
