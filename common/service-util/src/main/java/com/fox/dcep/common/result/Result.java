package com.fox.dcep.common.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 16:15 2023/7/13
 * @Modified by:
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {

    private Integer code;

    private String message;

    private T data;

    public static<T> Result<T> build(T data,ResultCodeEnum resultCodeEnum) {
        Result<T> result = new Result<>();
        if(data != null) {
            result.setData(data);
        }
        result.setCode(resultCodeEnum.getCode());
        result.setMessage(resultCodeEnum.getMessage());
        return result;
    }

    public static<T> Result<T> ok(T data) {
        return build(data, ResultCodeEnum.SUCCESS);
    }

    public static<T> Result<T> fail(T data) {
        return build(data,ResultCodeEnum.FAIL);
    }

}
