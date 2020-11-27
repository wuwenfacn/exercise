package com.example.exercise.commons.exception;


import com.example.exercise.commons.result.ResultCodeEnum;
import lombok.Data;

@Data
public class ServiceException extends BaseException {

    public ServiceException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum);
    }
}
