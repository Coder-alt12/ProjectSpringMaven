package org.example.controlers;

import org.example.exeptions.DataNotValidatedExeption;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorsControler {

    @ExceptionHandler(DataNotValidatedExeption.class)
    public ResponseEntity<String> handleDataNotValidatedExeption(DataNotValidatedExeption ex){

        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

}
