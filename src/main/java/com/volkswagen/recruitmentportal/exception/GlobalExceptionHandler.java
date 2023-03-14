package com.volkswagen.recruitmentportal.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {CandidateNotFoundException.class})
    public ResponseEntity<Object> handleCandidateNotFoundException(CandidateNotFoundException candidateNotFoundException){
        CustomExceptionDetails customExceptionDetails = new CustomExceptionDetails(
                candidateNotFoundException.getMessage(),
                candidateNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );
        return new ResponseEntity<>(customExceptionDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = {NoSuchElementException.class})
    public ResponseEntity<Object> handleNoSuchElementException(NoSuchElementException noSuchElementException){
        CustomExceptionDetails customExceptionDetails = new CustomExceptionDetails(
                noSuchElementException.getMessage(),
                noSuchElementException.getCause(),
                HttpStatus.NOT_FOUND
        );
        return new ResponseEntity<>(customExceptionDetails, HttpStatus.NOT_FOUND);
    }
}
