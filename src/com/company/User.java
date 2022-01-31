package com.company;
//login, password, email, age;
public class User {
    private String login;
    private String email;
    private String password;
    private int age;

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public String getLogin() {
        return login;
    }

    public User (String login, String email, String password, int age){
        this.login = login;
        this.email = email;
        this.password = password;
        this.age = age;
    }
}
