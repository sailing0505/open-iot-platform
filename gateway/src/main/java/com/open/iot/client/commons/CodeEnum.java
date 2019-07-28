package com.open.iot.client.commons;

/**
 * 
* @ClassName: CodeEnum 
* @Description: 一般状态 
* @author huy
* @date 2019年7月28日 下午1:10:31 
*
 */
public enum CodeEnum {
    SUCCESS(0),
    ERROR(1);

    private Integer code;
    CodeEnum(Integer code){
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
