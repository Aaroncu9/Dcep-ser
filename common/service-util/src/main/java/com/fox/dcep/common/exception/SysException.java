package com.fox.dcep.common.exception;

import com.fox.dcep.common.result.ResultCodeEnum;
import lombok.Data;

/**
 * @author : Aaron
 * @since : Created in 16:42 2023/7/13
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
