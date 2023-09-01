package com.zuitt;

public class Main {
    public static void main(String[] args){

        Nokia nokiaPhone = new Nokia();
        nokiaPhone.sendText("Hello from the 90's", "John");
        nokiaPhone.playMusic("Backstreet Boys - Shape of My Heart");

        Samsung samsungPhone = new Samsung();
        samsungPhone.sendText("Hw r u doing today?<3 :D", "Jane");
        samsungPhone.playMusic("Taylor Swift - Love Story");
        samsungPhone.takePicture();
        samsungPhone.takeVideo();
    }
}
