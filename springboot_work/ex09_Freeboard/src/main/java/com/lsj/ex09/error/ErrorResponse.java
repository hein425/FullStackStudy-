package com.lsj.ex09.error;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorResponse {

    private HttpStatus httpStatus;
    private String message;
    private LocalDateTime localDateTime;

}
