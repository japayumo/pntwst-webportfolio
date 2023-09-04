package com.zuitt;

import java.util.ArrayList;

public class Course {
    private String name;
    private String description;
    private String price;

    // This will be used as temporary database to store a list of courses
    private ArrayList<String> courses = new ArrayList<>();

    // empty constructor
    public Course() {}

    // parametrized constructor
    public Course(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }
    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }
    // end of getters and setters

    // methods
    public String addCourse(String name){
        courses.add(name);
        return name + " was successfully added";
    }

    public boolean containsCourse(String name){
        return courses.contains(name);
    }

    // SOLID Principles
    // [Section] Solid Responsibility Principle
    // A class should only have one responsibility
    // This violates the concept of Single Responsibility because this class' responsibility is to manage our courses data and manipulate it
    public String formatText(String name){
        return name.toLowerCase();
    }

}//class Course
