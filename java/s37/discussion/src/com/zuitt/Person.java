package com.zuitt;

public class Person implements Human{

    // properties
    private String name;
    private int age;

    public Person() {}

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // getters and setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    // end of getters and setters

    public void eat() {
        System.out.println(getName() + " is eating.");
    }

    public void breathe() {
        System.out.println(getName() + " takes a deep breath.");
    }

    public void sleep() {
        System.out.println(getName() + " is sleeping.");
    }
}//class Person
