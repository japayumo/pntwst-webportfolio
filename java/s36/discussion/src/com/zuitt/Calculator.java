package com.zuitt;

// [Section] Abstraction
/*
    - Abstraction is the process where all logic and code complexity is hidden from the users/developers which helps reduce confusion and allows them to focus on "what" of things rather than the "how"
*/
// This interface will be used as a blueprint by other classes
public interface Calculator {
    // All of these methods are required to be implemented to the class that will use Calculator interface

    // Abstract methods
    void compute(String numA, String numB, String operation);
    void turnOff();

}
