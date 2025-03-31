package com.apigateway.exception;

public class UserDoesNotExistException extends RuntimeException{

    public UserDoesNotExistException(Integer message)
    {
        super(message +" Opps!! this userid doesn't exist");
    }
}
