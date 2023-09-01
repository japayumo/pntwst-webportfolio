package com.zuitt;

public class Nokia implements Cellphone{
    private String message;
    private String recepient;
    private String song;
    public Nokia(){}

    public Nokia(String message, String recepient, String song){
        this.message = message;
        this.recepient = recepient;
        this.song = song;

    }

    // Getters and Setters
    public String getMessage(){
        return message;
    }
    public String getRecepient(){
        return recepient;
    }
    public String getSong(){
        return song;
    }

    public void setMessage(String message){
        this.message = message;
    }
    public void setRecepient(String recepient){
        this.recepient = recepient;
    }
    public void setSong(String song){
        this.song = song;
    }

    // Methods
    public void sendText(String message, String recepient){
        System.out.println("Text message sent to: " + recepient);
        System.out.println(message);
    }
    public void playMusic(String songName){
        System.out.println("The song " + songName +" is playing.");
    }

}
