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

} // class Example
