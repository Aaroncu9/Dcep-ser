package com.fox.dcep.common.exception;

import com.fox.dcep.common.result.Result;
import com.fox.dcep.common.result.ResultCodeEnum;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : Aaron
 * @since : Created in 16:42 2023/7/13
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result build(SysException e) {
        return Result.fail(null);
    }
}
