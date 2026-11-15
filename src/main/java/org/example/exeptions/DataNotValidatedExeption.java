package org.example.exeptions;

public class DataNotValidatedExeption extends RuntimeException {
    public DataNotValidatedExeption(String message) {
        super(message);
    }
}
