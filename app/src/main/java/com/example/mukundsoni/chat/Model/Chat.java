package com.example.mukundsoni.chat.Model;

public class Chat {

    private String sender;
    private String reciver;
    private String message;
    private boolean isseen;

    public Chat(String sender, String reciver, String message,boolean isseen) {
        this.sender = sender;
        this.reciver = reciver;
        this.message = message;
        this.isseen = isseen;
    }

    public Chat(){
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReciver() {
        return reciver;
    }

    public void setReciver(String reciver) {
        this.reciver = reciver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isIsseen() {
        return isseen;
    }

    public void setIsseen(boolean isseen) {
        this.isseen = isseen;
    }
}
