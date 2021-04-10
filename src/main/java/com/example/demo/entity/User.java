package com.example.demo.entity;

public class User {
    public String username;
    public int password;
    public String getName(){
        return  username;
    }
    public void setName(String username){
        this.username = username;
    }
    public int getPassword(){
        return  password;
    }
    public void setPassword(int password){
        this.password = password;
    }
    @Override
    public String toString(){


        return "user{username = '"+username+"\""+","+"password = "+ password +"}";

    }

}
