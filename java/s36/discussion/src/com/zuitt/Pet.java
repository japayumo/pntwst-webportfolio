package com.zuitt;

// Organizing data in a structured manner greatly enhances code clarity and maintainability
// One effective approach to achieve this organization by encapsulating related data and methods within a class
public class Pet {

    // Properties
    private String name;
    private String gender;
    private String classification;
    private int age;
    private String address;
    private String sound;

    public Pet(){}

    public Pet(String name, String gender, String classification, int age, String address, String sound){
        this.name = name;
        this.gender = gender;
        this.classification = classification;
        this.age = age;
        this.address = address;
        this.sound = sound;
    }

    // Getters
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public String getClassification(){
        return classification;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public String getSound(){
        return sound;
    }

    // Setters
    public void setName(String name){
       this.name = name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setClassification(String classification){
        this.classification = classification;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSound(String sound){
        this.sound = sound;
    }

    // Methods
    public void describePet(){
        System.out.println(getName() + " is a " + getGender() + " " + getClassification() + " who is " + getAge() + " year/s old.");
    }
    public void makeSound(){
        System.out.println(getName() + " says "+ getSound());
    }

} // class Pet
