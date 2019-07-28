package com.open.iot.exception;

/**
 * 
* @ClassName: ServiceException 
* @Description: 平台服务层异常，主要是在业务数据或者状态异常时使用 
* @author huy
* @date 2019年7月28日 下午1:17:46 
*
 */
public class ServiceException extends RuntimeException{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer code;

    public ServiceException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public ServiceException(Integer code,String message) {
        super(message);
        this.code = code;
    }

    public ServiceException(String message) {
        super(message);
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
