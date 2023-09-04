package com.zuitt;

public class Premium extends Admin{

    public Premium(String name, String joinDate, boolean isAdmin, String role){
        super(name, joinDate, isAdmin, role);
    }

    public void login(){
        System.out.println("Result from a Premium user:");
        System.out.println("View products online with free shipping!");
    }

    public void checkout(){
        System.out.println("Payment received. Thank you for your purchase!");
    }



}
