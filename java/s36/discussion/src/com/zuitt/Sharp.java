package com.zuitt;

public class Sharp implements Calculator{

    private String brand;
    private int price;

    public Sharp(){}

    public Sharp(String brand, int price){
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

    public void compute(String numA, String numB, String operation){
        int intNumA = Integer.parseInt(numA);
        int intNumB = Integer.parseInt(numB);

        if(operation.equalsIgnoreCase("add")){
            System.out.println(intNumA + intNumB);
        }
        else if(operation.equalsIgnoreCase("subtract")){
            System.out.println(intNumA - intNumB);
        }
        else if(operation.equalsIgnoreCase("multiply")){
            System.out.println(intNumA * intNumB);
        }
        else if(operation.equalsIgnoreCase("divide")&& intNumB > 0){
            System.out.println(intNumA / intNumB);
        }
        else{
            System.out.println("Invalid operation or operation provided");
        }

    } // void compute

    public void turnOff(){
        System.out.println("Closing " + getBrand()+ " calculator");
    }

} // class Sharp
