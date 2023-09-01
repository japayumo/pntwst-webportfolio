package com.zuitt;

import com.zuitt.accessmodifiers.Example;
import com.zuitt.accessmodifiers.Test;

import java.util.Objects;

public class Main {
    public static void main(String[] args){

    // Instantiate a new Car object using the Car class
    Car myCar = new Car();
    System.out.println(myCar);

    myCar.setName("Civic");
    myCar.setBrand("Honda");
    myCar.setManufacturedDate(1998);
    myCar.setOwner("Angelo");
    // Dot notation to access properties of an object
    /*System.out.println(myCar.name);
    System.out.println(myCar.brand);
    System.out.println(myCar.manufacturedDate);*/
    System.out.println(myCar.propertyPrinter());;

    // Adding properties to objects cannot be done unless defined in the class
    // myCar.mileage = 100000; // Error: Cannot resolve symbol 'mileage'
    // System.out.println(Objects.toString(myCar)); // com.zuitt.Car@65ab7765

    // ClassName objectName = new ClassName (arguments...);
    Car otherCar = new Car("Charger", "Dodge", 1978, "Dominic Torreto");
    otherCar.propertyPrinter();
    // Cannot access private fields
    //System.out.println(otherCar.name);

    // System.out.println(otherCar.getName()); // Charger
    // System.out.println(otherCar.getBrand()); // Dodge
    // System.out.println(otherCar.getYearOfMake()); // 1978
    // System.out.println(otherCar.getOwner());
    System.out.println(otherCar.propertyPrinter());
    /*
        Properties of the Object:
        Name: Charger
        Brand: Dodge
        Manufactured Date: 1978
        Owner: Dominic Torreto
    */

    otherCar.setOwner(("Paul Walker"));
    System.out.println(otherCar.getOwner());

    System.out.println(otherCar.propertyPrinter());
    /*
        Name: Charger
        Brand: Dodge
        Manufactured Date: 1978
        Owner: Paul Walker
    */
    otherCar.drive(); // Vroom Vroom Vroom

    /*---------------------------*/
    Example accessModifier = new Example();
    System.out.println(accessModifier.message);

    // System.out.println(accessModifier.defaultMessage);
    Test defaultAccess = new Test();
    defaultAccess.accessingDefault();

    //Protected protectedAccess = new Protected();
    //protectedAccess.printProtectedMessage();

    // The "extends" keyword allow to create a parent-child class relationship (or base class-sub class), relationship between the "Example" and "Protected" class
    // The "extends" keyword inherits all the properties and methods of the "Example" class and sends it to the "Protected" class
    /*public static class Protected extends Example{
        public void printProtectedMessage(){
            System.out.println(protectedMessage);
        }
    }*/

    //accessModifier.privateMessage;
    accessModifier.printPrivateMessage(); // This message is private

    } // void main
} // Main

