package com.zuitt;

public class User {
    private String name;
    private String joinDate;
    private boolean isAdmin;

    public User(){}

    public User(String name, String joinDate, boolean isAdmin){
        this.name = name;
        this.joinDate = joinDate;
        this.isAdmin = isAdmin;
    }

    // getters and setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getJoinDate(){
        return joinDate;
    }
    public void setJoinDate(String joinDate){
        this.joinDate = joinDate;
    }

    public boolean getIsAdmin(){
        return isAdmin;
    }
    public void setAdmin(boolean isAdmin){
        this.isAdmin = isAdmin;
    }

    public void login(){
        System.out.println(getName() + "has successfully logged in");
    }

    public void checkout(){
        System.out.println("Proceeding to checkout");
    }


}//class User
