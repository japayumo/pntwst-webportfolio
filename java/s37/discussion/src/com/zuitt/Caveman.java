package com.zuitt;

// Liskov Substitution Principle
// If class A is a subtype/child of class B, we should be able to replace B with A w/o disrupting the behavior of our program
public class Caveman implements Human{

    private String name;
    private int age;

    public Caveman(){}
    public Caveman(String name, int age){
        this. name = name;
        this.age = age;
    }

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


    public void eat() {
        System.out.println(getName() + " is eating with their friends");
    }
    public void breathe() {
        System.out.println(getName() + " takes a deep breath");
    }
    public void sleep() {
        System.out.println(getName() + " is sleeping in a cave");
    }
}//class Caveman
