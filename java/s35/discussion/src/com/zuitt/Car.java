package com.zuitt;

public class Car {

    // [Section] Properties
    /*
        - Defines the list of properties that an object would have
    */
    private String name;
    private String brand;
    private int manufacturedDate;
    private String owner;

    // method
    /*public void propertyPrinter(){
        System.out.println("Properties of the Object");
        System.out.println(this.name);
        System.out.println(this.brand);
        System.out.println(this.manufacturedDate);*/

    public String propertyPrinter(){
        return "Properties of the Object: " + "\nName: " + getName() + "\nBrand: " + getBrand() + "\nManufactured Date: " + getYearOfMake() + "\nOwner: " + getOwner();

    }

    // Empty Constructor
    // We build an empty constructor whenever there is a parametized constructor
    public Car(){
    }

    // Parametized Constructor
    /*
        Syntax:
        public ClassName(parameters...)
    */
    public Car( String name, String brand, int manufacturedDate, String owner){
        // this.property = parameter
        this.name = name;
        this.brand = brand;
        this.manufacturedDate = manufacturedDate;
        this.owner = owner;
    }

    // Getters and Setters
    // Getters and setter are not required/optional

    // Getter methods
    // Methods/Functions to retrieve private property values

    public String getName(){
        return this.name;
    }

    public String getBrand(){
        return this.brand;
    }

    public int getYearOfMake(){
        return this.manufacturedDate;
    }

    public String getOwner(){
        return this.owner;
    }


    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setManufacturedDate(int manufacturedDate){
        this.manufacturedDate = manufacturedDate;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public void drive() {
        System.out.println("Vroom Vroom Vroom");
    }

} // class Car


