package com.company;

public class AccessDeniedException extends RuntimeException{
    public AccessDeniedException (String massage){
        super(massage);
    }
}
