package com.company;

//login, password, email, age;
public class User {
    private final String login;
    private final String email;
    private final String password;
    private final int age;

    public User(String login, String email, String password, int age) {
        this.login = login;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public String getPassword() {

        return password;
    }

    public int getAge() {
        return age;
    }

    public String getLogin() {

        return login;
    }
}
