package com.zuitt;

public class Main {
    public static void main(String[] args){

    // [Section] Encapsulation
    /*
        - Encapsulations is the mechanism of wrapping data (variables) and code acting on the data (methods) together as a single unit
        - Unlike in procedural programming languages like JavaScript where code is written necessary following a specific flow of the script, Java separates its code into classes.
    */

    /*String petAName = "Franky";
    String petAGender = "Female";
    String petAClassification = "Dog";
    int petAge = 10;
    String petAddress = "Manila, Philippines";
    String petASound = "Awoo aw aw";

    describePet(petAName, petAGender,petAClassification, petAge);
    makeSound(petAName, petASound);*/
    /*
        Franky is a Female Dog who is 10 years old.
        Franky says Awoo aw aw
    */

    /*String petBName = "Simba";
    String petBGender = "Male";
    String petBClassification = "Lion";
    int petBAge = 1;
    String petBAddress = "Pride Lands";
    String petBSound = "Hakuna Matata!";

    describePet(petBName, petBGender,petBClassification, petBAge);
    makeSound(petBName, petBSound);*/
    /*
        Simba is a Male Lion who is 1 years old.
        Simba says Hakuna Matata!
    */

    Pet petA = new Pet("Franky", "Female", "Dog", 10, "Manila, Philippines", "Awoo aw aw");
    petA.describePet(); // Franky is a Female Dog who is 10 years old.
    petA.makeSound(); // Franky says Awoo aw aw

    Pet petB = new Pet("Simba","Male", "Lion", 1, "Pride Lands", "Rawr" );
    petB.describePet(); // Simba is a Male Lion who is 1 years old.
    petB.makeSound(); // Simba says Rawr

    // [Section] Abstraction
    Sharp mySharp = new Sharp("Sharp", 1000);
    mySharp.compute("23", "45", "divide");
    mySharp.turnOff();

    Casio myCasio = new Casio("Casio", 2000);
    myCasio.compute("23", "45", "divide");
    myCasio.computeRemainder("38", "4");
    myCasio.turnOff();

    useCalculator(mySharp);
    useCalculator(myCasio);


    } // void main

public static void useCalculator(Calculator calculator){
        calculator.compute("64", "32", "add");
        calculator.turnOff();


}
    /*public static void describePet(String name, String gender, String classification, int age){
        System.out.println(name + " is a " + gender + " " + classification + " who is " + age + " years old.");
    }

    public static void makeSound(String name, String sound){
        System.out.println(name + " says "+ sound);
    }*/


} // class Main
