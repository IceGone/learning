package com.icegone.day21;

/**
 * @program: architect
 * @description: 自定义异常
 * @author: bjchen
 * @create: 2020-06-14
 **/
public class MyException extends Exception {
    public String getErrorCode() {
        return errorCode;
    }

    public MyException() {
    }

    public MyException(String message){
        super(message);
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    private String errorCode;


}
