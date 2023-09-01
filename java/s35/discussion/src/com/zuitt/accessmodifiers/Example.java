package com.zuitt.accessmodifiers;

import com.zuitt.Car;

public class Example {

    // [Section] Public Access Modifier
    // The "Car" class can be accessed from the "Example" class because it has the access modifier of "public"
    public Car defaultCar;

    public String message = "Hello from default";

    // [Section] Default Access Modifier
    // This cannot be accessed outside the "access modifiers package"
    String defaultMessage = "This cannot be accessed outside of the default class";

    // [Section] Protected Access Modified
    // Can only be accessed inside the same package and outside the package through a child/sub class
    protected String protectedMessage = "This is a protected message";

    // [Section] Private Access Modifier
    // Can only be accessed within the same class
    private String privateMessage = "This message is private";

    public void printPrivateMessage(){
        System.out.println(privateMessage);
    }



} // class Example


