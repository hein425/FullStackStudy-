package com.lsj.ex08.error;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import org.springframework.core.Constants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Set;

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

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ErrorResponse> ConstraintViolationException(ConstraintViolationException e){

        //스트림으로 만들기
        String msg = getConstraintViolations()
                .stream()
                .map(constraintViolation -> constraintViolation.getMessage())
                .reduce("",(s,s2) -> s+s2);



        // for로 만들기

        Set<ConstraintViolation<?>> set = getConstraintViolations();
        String test = "";
        for (ConstraintViolation<?> item : set){
            System.out.println(item);
            System.out.println(item.getMessage());
            test = item.getMessage();
        }
//        System.out.println(test);

//        System.out.println(Arrays.toString(e.getDetailMessageArguments()));
//        e.getFieldError()
//                .stream()
//                .forEach(fieldError -> System.out.println(fieldError.getDefaultMessage()));


//        String msg = (String) Arrays.stream(e.getMessage())
//                .reduce("",(s,s2)-> s.toString()+s2.toString());

        ErrorResponse errorResponse = ErrorResponse.builder()
                .httpStatus(HttpStatus.BAD_REQUEST)
                .message(msg)
                .localDateTime(LocalDateTime.now())
                .build();


        return ResponseEntity
                .status(errorResponse.getHttpStatus())
                .body(new ErrorResponse());
    }

    private Set<ConstraintViolation<?>> getConstraintViolations() {
        return null;
    }


}