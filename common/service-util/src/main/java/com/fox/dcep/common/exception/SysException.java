package com.fox.dcep.common.exception;

import com.fox.dcep.common.result.ResultCodeEnum;
import lombok.Data;

/**
 * @Author: Aaron
 * @Description: 统一异常类
 * @Date: Created in 16:46 2023/7/13
 * @Modified by:
 */
@Data
public class SysException extends RuntimeException {

    private Integer code;

    public SysException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public SysException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    @Override
    public String toString() {
        return "DcepException{" +
                "code=" + code +
                ", message=" + this.getMessage() +
                '}';
    }

}
