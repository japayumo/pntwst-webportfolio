package com.zuitt;
/* [Section] Composition
    - The "composition" allows modelling of objects that are made up of other objects and is defined by "has a relation"
    (Example: A car has a driver)
*/
public class Car {
    // properties
    private String make;
    private String model;
    private Driver driver;

    // empty constructor
    public Car(){}

    // parametized constructor
    public Car(String make, String model, Driver driver){
        this.make = make;
        this.model = model;
        this.driver = driver;
    }

    // method
    public void start(){
        System.out.println("The car is running");
    }

    public String getDriver(){
        return driver.name;
    }

}//class Car
