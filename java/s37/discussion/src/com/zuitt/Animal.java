package com.zuitt;

public class Animal {
    // Properties
    private String classification;
    private String dietType;

    // Empty constructor
    public Animal(){};

    // Parametized Constructor
    public Animal(String classification, String dietType){
        this. classification = classification;
        this. dietType = dietType;
    }

    // Getters and Setters
    public String getClassification(){
        return classification;
    }
    public void setClassification(String classification){
        this.classification = classification;
    }

    public String getDietType(){
        return dietType;
    }
    public void setDietType(String dietType){
        this.dietType = dietType;
    }
    // End of Getters and Setters

    public void sleep(){
        System.out.println("The animal is sleeping.");
    }
}//class Animal
