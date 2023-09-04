package com.zuitt;

public class Main {
    public static void main(String[] args){

        Admin admin = new Admin("Jane Smith", "08/01/2023", true, "admin");
        admin.addProduct();

        Premium premiumUser = new Premium("Mickey", "08/02/2023", false, "Premium");
        premiumUser.login();
        premiumUser.checkout();

        Regular regularUser = new Regular("Donald", "08/03/2023", false, "Regular");
        regularUser.login();
        regularUser.checkout();

    }//void main
}//class Main
