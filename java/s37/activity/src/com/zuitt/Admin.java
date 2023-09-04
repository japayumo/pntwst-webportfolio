package com.zuitt;

public class Admin extends User{
    private String role;

    public Admin(){}

    public Admin(String name, String joinDate, boolean isAdmin, String role){
        super(name, joinDate, isAdmin);
        this.role = role;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public void addProduct(){
        System.out.println(getName() + " just added a new product");
    }
}//class Admin
