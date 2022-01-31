package com.company;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message){
        super("Пользователя с логином: " + message + " " + "не существует или не верно введён пароль");
    }
}
