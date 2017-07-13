package it.madlabs.fc.model;



/**
 * Created by Matte on 30/06/2017.
 */
public class User extends Person {
    String userName;
    String password;

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }










}
