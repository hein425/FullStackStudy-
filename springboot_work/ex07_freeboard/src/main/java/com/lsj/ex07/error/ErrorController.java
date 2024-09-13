package com.lsj.ex07.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.Arrays;

@ControllerAdvice
public class ErrorController {

    // email 중복
    // username 안넣었을때
    // emsil 안넣었을때
    // 이런 경우들에 에러 날려줘야함

    @ExceptionHandler(BizException.class)
    public ResponseEntity<ErrorResponse> mException(BizException e){

        ErrorResponse errorResponse = ErrorResponse.builder()
                .message(e.getErrorCode().getMessage())
                .httpStatus(e.getErrorCode().getHttpStatus())
                .localDateTime(LocalDateTime.now())
                .build();

        return ResponseEntity
                .status(e.getErrorCode().getHttpStatus())
                .body(new ErrorResponse());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> validityException(MethodArgumentNotValidException e){

        System.out.println(Arrays.toString(e.getDetailMessageArguments()));
//        e.getFieldError()
//                .stream()
//                .forEach(fieldError -> System.out.println(fieldError.getDefaultMessage()));


        String msg = (String) Arrays.stream(e.getDetailMessageArguments())
                .reduce("",(s,s2)-> s.toString()+s2.toString());

        ErrorResponse errorResponse = ErrorResponse.builder()
                .httpStatus(HttpStatus.BAD_REQUEST)
                .message( Arrays.toString(e.getDetailMessageArguments()))
                .localDateTime(LocalDateTime.now())
                .build();


        return ResponseEntity
                .status(errorResponse.getHttpStatus())
                .body(new ErrorResponse());
    }
}