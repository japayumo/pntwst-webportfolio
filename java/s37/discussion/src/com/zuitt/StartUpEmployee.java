package com.zuitt;

public class StartUpEmployee implements MaintenanceStaff, AdminStaff {
    public void cleanOffice(){
        System.out.println("The staff is cleaning the office");
    }

    public void sortPapers(){
        System.out.println("The staff is sorting out the paperwork.");
    }



}
