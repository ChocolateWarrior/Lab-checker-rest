package com.usb.labchecker.exceptions;

public class StudentNotFoundException extends RuntimeException{

    private final String message = "Student with such credentials was not found!";

    @Override
    public String getMessage(){
        return this.message;
    }
}
