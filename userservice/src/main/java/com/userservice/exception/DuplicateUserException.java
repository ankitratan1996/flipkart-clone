package com.userservice.exception;

public class DuplicateUserException extends RuntimeException{

    public DuplicateUserException(String message)
    {
        super(message +" Opps!! this email is already register");
    }
}
