package com.Bingo;

public class AlreadyChosenException extends RuntimeException {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public AlreadyChosenException(String s) {
        super(s);
    }
    
}