package com.example.mukundsoni.chat.Model;

public class User {

    private String id;
    private String username;
    private String imageURl;
    private String status;
    private String search;

    public User(String id, String username, String imageURl, String status, String search) {
        this.id = id;
        this.username = username;
        this.imageURl= imageURl;
        this.status= status;
        this.search= search;

    }

    public User(){


    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImageURl() {
        return imageURl;
    }

    public void setImageURl(String imageURl) {
        this.imageURl = imageURl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
