package org.example.exception;

/**
 * Класс NotEmptyListException
 * Этот класс является исключением, которое выбрасывается при попытке
 * работы класса InitializerListImpl с непустым списком
 */
public class FillListException extends RuntimeException{
    public FillListException(String message){
        super(message);
    }
}
