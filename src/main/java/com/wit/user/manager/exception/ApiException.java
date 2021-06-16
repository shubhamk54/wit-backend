package com.wit.user.manager.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ApiException extends Exception {

    private static final long serialVersionUID = -7728890108742026510L;
    private HttpStatus httpStatus;
    private String responseMsg;
    private ServiceErrorTypes serviceErrorTypes;

    public ApiException(Throwable t, HttpStatus httpStatus, String responseMsg) {
        super(t.getMessage());
        this.httpStatus = httpStatus;
        this.responseMsg = responseMsg;
    }

    public ApiException(HttpStatus httpStatus, String responseMsg) {
        this.httpStatus = httpStatus;
        this.responseMsg = responseMsg;
    }

    public ApiException(Throwable e, ServiceErrorTypes serviceErrorTypes) {
        super(e);
        this.serviceErrorTypes = serviceErrorTypes;
    }

}
