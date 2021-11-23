package com.grupo4.mslikes.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import com.grupo4.mslikes.exceptions.CannotDeleteLikesException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ControllerAdvice
@ResponseBody
public class CannotDeleteLikesAdvice {
    
    @ResponseBody
    @ExceptionHandler(CannotDeleteLikesException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String EntityCannotDeleteAdvice(CannotDeleteLikesException ex) {
        return ex.getMessage();
    }
}
