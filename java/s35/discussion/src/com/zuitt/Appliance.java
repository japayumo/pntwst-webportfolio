package com.zuitt;

public class Appliance {

    public String name;
    public String brand;
    public int manufactureDate;

    public Appliance(){
    }

    public Appliance(String name, String brand, int manufactureDate){
        this.name = name;
        this.brand = brand;
        this.manufactureDate = manufactureDate;
    }

    public void appliancePrinter(){
        System.out.println(this.name);
        System.out.println(this.brand);
        System.out.println(this.manufactureDate);

    }
}
/*Appliance newAppliance = new Appliance("Microwave", "Whirlpool", 2015);
    newAppliance.appliancePrinter();*/