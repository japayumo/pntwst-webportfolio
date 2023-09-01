package com.zuitt;

public class Casio implements Calculator, ScientificCalculator {

    private String brand;
    private int price;

    // Empty Constructor
    public Casio(){}

    // Parametized Constructor
    public Casio (String brand, int price){
        this.brand = brand;
        this.price = price;
    }

    // Getters and Setters
    public String getBrand(){
        return brand;
    }
    public int getPrice(){
        return price;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setPrice(int price){
        this.price = price;
    }


    public void compute(String numA, String numB, String operation) {
        double doubleNumA = Double.parseDouble(numA);
        double doubleNumB = Double.parseDouble(numB);

        if(operation.equalsIgnoreCase("add")){
            System.out.println(doubleNumA + doubleNumB);
        }
        else if(operation.equalsIgnoreCase("subtract")){
            System.out.println(doubleNumA - doubleNumB);
        }
        else if(operation.equalsIgnoreCase("multiply")){
            System.out.println(doubleNumA * doubleNumB);
        }
        else if(operation.equalsIgnoreCase("divide")&& doubleNumB > 0){
            System.out.println(doubleNumA / doubleNumB);
        }
        else{
            System.out.println("Invalid operation or operation provided");
        }
    }

    public void turnOff(){
        System.out.println("Closing " + getBrand()+ " calculator");
    }

    public void computeRemainder(String numA, String numB){
        double doubleNumA = Double.parseDouble(numA);
        double doubleNumB = Double.parseDouble(numB);

        System.out.println(doubleNumA%doubleNumB);
    }
}
