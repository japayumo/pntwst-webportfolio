package com.zuitt;

public class Regular extends Admin{

    public Regular(String name, String joinDate, boolean isAdmin, String role){
        super(name, joinDate, isAdmin, role);
    }

    public void login(){
        System.out.println("Purchase today and get a 25% discount on your shipping fee");
    }

    public void checkout(){
        System.out.println("Please login before you can process your payment");
    }
}//class Regular
