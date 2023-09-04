package com.zuitt;

public class Main {
    public static void main(String[] args){

        Crocodile myPet = new Crocodile();

        // from animal.java
        myPet.setClassification("Reptile");
        myPet.setDietType("Carnivore");

        // from reptile.java
        myPet.setHabitat("Fresh water");
        myPet.setHasScales(true);

        // from crocodile.java
        myPet.setName("Croco Boy");
        myPet.setAge(7);

        System.out.println(myPet.getClassification());
        myPet.describePet();

        myPet.sleep();
        myPet.eat();

        Driver myDriver = new Driver("Paul Walker", 32);
        System.out.println(myDriver.getAge());
        Car myCar = new Car("Ferrari", "F430", myDriver);

        System.out.println(myCar.getDriver());

        // System.out.println(myCar.getName());
        // The getName() method is not available because the "Car" class did not inherit the "Driver" class, but it is composed of it

        Turtle myOtherPet = new Turtle("Reptile", "Herbivore", "Salt Water", false, "Squirtle", 7);
        myPet.swim();
        myPet.sleep();
        myOtherPet.swim();

        // [Section] Inheritance vs Interfaces
        /*
            - There are instances when objects must not be instantiated, and creating classes out of them is not necessary
            - Take, for instance, the case of 'Human.java' which serves as a blueprint but does not require actual object creation
            - In such cases, the use of interfaces proves more suitable than concrete classes
        */
        Person me = new Person("John Smith", 31);
        me.eat();
        me.breathe();
        me.sleep();

        Course course = new Course("HTML", "The basics of programming", "500");
        course.addCourse("HTML");

        System.out.println("Result of getCourses() method:");
        System.out.println(course.getCourses());

        System.out.println("Result of containsCourse() method:");
        System.out.println(course.containsCourse("HTML"));

        TextFormat textFormatter = new TextFormat();
        System.out.println(textFormatter.formatText(course.getCourses().get(0)));

        Caveman caveman = new Caveman("John Doe", 1000);
        System.out.println("Result of Liskov Substitution:");
        doAllActions(me);
        doAllActions(caveman);


    }//void main
    // This demonstrates the Liskov Substitution Principle
    /*
        - You're able to pass both "Human" object and "Caveman" object to the same method ("doAllActions) because "Caveman" is a substitute for "Human"
    */
    public static void doAllActions(Human human){
        human.eat();
        human.breathe();
        human.sleep();

    }

    // [Section] Interface Segregation
    /*
        - Larger interfaces should be split into smaller ones. By doing so, we can ensure that implementing classes only need to be concerned about methods that are of interest to them
    */



    /* [Section] Dependency Inversion
        - By passing an interface instead of a class allows flexibility in creating a startup company that can have employee that can cleanOffice and sortPapers only.
    */
    //StartUpEmployee startUpEmployee = new StartUpEmployee();

    CorporateEmployee corporateEmployee = new CorporateEmployee();

    //StartUpCompany startupCompany = new StartUpCompany();


}//class Main
