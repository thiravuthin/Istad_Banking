package com.istad.mbanking.exception;

import com.istad.mbanking.best.BestError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiException {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public BestError<?> handleValidationException(MethodArgumentNotValidException MethodArgumentNotValidException ){
        return null;
    }
}
