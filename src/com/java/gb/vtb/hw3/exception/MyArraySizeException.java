package com.java.gb.vtb.hw3.exception;

public class MyArraySizeException extends Exception {
    public MyArraySizeException(String message){
        super(message);
        printStackTrace();
    }
}
