package com.wit.user.manager.exception;

import org.springframework.http.HttpStatus;

public enum ServiceErrorTypes {

    DATA_NOT_FOUND(HttpStatus.NOT_FOUND, "Data Not Found"), INTERNAL_SERVICE_ERROR(HttpStatus.INTERNAL_SERVER_ERROR,
            "Internal Server Error");

    HttpStatus httpStatus;
    String errorDescription;

    ServiceErrorTypes(HttpStatus httpStatus, String errorDescription) {
        this.httpStatus = httpStatus;
        this.errorDescription = errorDescription;
    }

}
