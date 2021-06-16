package com.wit.user.manager.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ExceptionResponse {

    private String errorMessage;
    private String requestedURI;
    private HttpStatus httpStatus;
    private int httpStatusCode;
}
