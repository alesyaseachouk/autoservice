package com.solvd.autoservice.exceptions;

public class WrongDataException extends RuntimeException {

    public WrongDataException(String message) {
        super(message);
    }

    public WrongDataException(String message, Throwable cause) {
        super(message, cause);
    }
}
