package com.gdufs.ivos.base.exception;

import com.gdufs.ivos.base.response.StatusCode;
import lombok.Getter;

/*  自定义业务异常类*/
public class ServiceException extends RuntimeException {

    @Getter
    private StatusCode statusCode;

    public ServiceException(StatusCode statusCode) {
        this.statusCode = statusCode;
    }
}
