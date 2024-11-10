package org.example.exception;
/**
 * Класс NotEmptyListException
 */
public class NotEmptyListException extends RuntimeException{
    public NotEmptyListException(String message){
        super(message);
    }
}
