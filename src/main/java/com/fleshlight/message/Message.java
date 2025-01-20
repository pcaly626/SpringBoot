package com.fleshlight.message;

public class Message {
    private String message;
    private String sender;

    public Message(String message, String sender){
        this.message = message;
        this.sender = sender;
    }

    public String getMessage(){
        return this.message;
    }

    public String getSender(){
        return this.sender;
    }
}
