package com.zuitt;

/* ====== [Section] Inheritance =====
    - Allows classes to inherit properties and methods from other classes which makes code reusable and efficient
    - The "extends" keyword defines that this class will inherit/extend properties and methods from the "Animal" class. the "extends" keyword inherits the properties, and methods/function of the other parent class
    - With the use of inheritance the information is made manageable in a hierarchical order
    - Relationships between classes is called super/parent class and sub/child class
*/
public class Reptile extends Animal{
    /* [Section] Open for extension, closed for modification / Open-closed principle
        -  by inheriting classes and adding properties modifying newly created class, we are implementing the open-closed principle
        - You should be able toadd new functionalty or behavior to module or class w/o changing its exising source code
        - Closed for Modification: Once a module or class is complete and working correctly, you should avoid making changes to its existing condition

    */

    //Properties
    private String habitat;
    private boolean hasScales;

    //Empty Constructor
    public Reptile(){}

    //Parametized Constructor
    public Reptile(String classification, String dietType, String habitat, boolean hasScales){
        // Using the super() function invokes the immediate parent class constructor
        super(classification,dietType);
        this.habitat = habitat;
        this.hasScales = hasScales;
    }

    // getters and setters
    public String getHabitat(){
        return habitat;
    }
    public void setHabitat(String habitat){
        this.habitat = habitat;
    }

    public boolean getHasScales(){
        return hasScales;
    }
    public void setHasScales(boolean hasScales){
        this.hasScales = hasScales;
    }
    // end of getters and setters

    public void eat(){
        System.out.println("The animal is eating");
    }



}//class Reptile
