package com.meli.obterdiploma.exception.handler;

import com.meli.obterdiploma.model.ErroStudent;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseEntity<List<ErroStudent>> handleStudentException(MethodArgumentNotValidException ex) {
        List<ObjectError> erros = ex.getBindingResult().getAllErrors();
        List<ErroStudent> results = new ArrayList<ErroStudent>();
        erros.forEach(e ->{
            ErroStudent error = new ErroStudent("MethodArgumentNotValidException",e.getDefaultMessage());
            results.add(error);
        });
//        ErroStudent error = new ErroStudent("MethodArgumentNotValidException",ex.getBindingResult().getFieldError().getDefaultMessage());

        return new ResponseEntity<>(results, HttpStatus.BAD_REQUEST);
    }


}
