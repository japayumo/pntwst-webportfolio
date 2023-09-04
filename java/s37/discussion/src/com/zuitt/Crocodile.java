package com.zuitt;

public class Crocodile extends Reptile{
    // Properties
    private String name;
    private int age;

    // Empty constructor
    public Crocodile() {}

    // Parametized constructor
    public Crocodile(String classification, String dietType, String habitat, boolean hasScales, String name, int age) {
        super(classification, dietType, habitat, hasScales);
        this.name = name;
        this.age = age;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // end of getters and setters

    public void describePet() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Classification: " + getClassification());
        System.out.println("Diet Type: " + getDietType());
        System.out.println("Habitat: " + getHabitat());
        System.out.println("Has Scales: " + getHasScales());
    }

    public void swim() {
        System.out.println("This crocodile is swimming using its webbed feet and powerful tail.");
    }

    // Method Overriding
    // Used to change the functionality of a method provided by a super/parent class to fit the needs of the current class
    // The function is overridden by replacing the definition of the method in the parent and child class
    public void sleep(){
        System.out.println(getName()+ " is sleeping");
    }

    // Method Overloading
    // Used to CHANGE PARAMETERS and functionality to previous inherited methods
    public void eat(String food){
        System.out.println(getName() + " is eating " + food + ".");
    }
}//class Crocodile
