package com.tr.business.config;

import com.tr.frame.common.exception.BusinessException;
import com.tr.frame.common.result.Result;
import com.tr.frame.common.result.ResultEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理
 *
 * @Author: TR
 * @Date: 2023/3/10
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Result handle(Exception e) {
        log.error("[系统异常]", e);
        return Result.fail(ResultEnum.UNKNOWN_ERROR.getCode(), e.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result handle(BusinessException businessException) {
        return Result.fail(businessException.getCode(), businessException.getMessage());
    }

    @ExceptionHandler(BadCredentialsException.class)
    public Result handle() {
        return Result.fail(ResultEnum.WRONG_PASSWORD);
    }

    @ExceptionHandler(AccessDeniedException.class)
    public Result handle(AccessDeniedException exception) {
        return Result.fail(ResultEnum.NO_ACCESS);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result handle(MethodArgumentNotValidException exception) {
        return Result.fail(exception.getFieldError().getField() + exception.getFieldError().getDefaultMessage());
    }

}
