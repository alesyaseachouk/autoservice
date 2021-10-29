package com.solvd.autoservice.exceptions;

public class WrongStorageNumberException extends Exception {

    public WrongStorageNumberException(String message) {
        super(message);
    }

    public WrongStorageNumberException(String message, Throwable cause) {
        super(message, cause);
    }
}
