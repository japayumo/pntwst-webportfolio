package com.zuitt;

public class Driver {
    public String name;
    private int age;

    //Empty constructor
    public Driver(){}

    //Parametrized constructor
    public Driver(String name, int age){
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





}//class Driver
