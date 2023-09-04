package com.zuitt;
/* [Section] Polymorphism
    - Polymorphism is derived from the greek word "poly" meaning many and "morph" means forms
    - It is the ability of an object to take many forms
*/
public class Turtle extends Reptile{
    private String name;
    private int age;

    public Turtle(String classification, String dietType, String habitat, boolean hasScales, String name, int age) {
        super(classification, dietType, habitat, hasScales);
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void swim(){
        System.out.println("This turtle is swimming using it's limbs and webbed feet.");
    }
}//class Turtle
