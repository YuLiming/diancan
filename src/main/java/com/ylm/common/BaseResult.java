package com.ylm.common;

import java.io.Serializable;

public class BaseResult implements Serializable {

    private static final int SUCCESS = 200;

    private static final int FAUIL = 400;

    public static final int NOLOGIN = 403;

    private boolean success;

    // 消息失败的时候显示，成功前端自定义
    private String message;

    // 操作结果代码 对应enums.CodeResultEnum,为以后手机端使用
    private int code;

    private String token;

    // 对象
    private Object resultObj;

    public BaseResult() {
        this.success = false;
        this.message = null;
        this.resultObj = null;
        this.code = 0;
    }

    public BaseResult(boolean isSuccess, String msg) {
        this.success = isSuccess;
        this.message = msg;
        this.resultObj = null;

        if (this.success) {
            this.code = SUCCESS;
        } else {
            this.code = FAUIL;
        }
    }

    public BaseResult(boolean isSuccess, String msg,int code) {
        this.success = isSuccess;
        this.message = msg;
        this.resultObj = null;
        this.code = code;
    }

    public BaseResult(boolean isSuccess, String msg,String token) {
        this.success = isSuccess;
        this.message = msg;
        this.resultObj = null;
        this.token = token;
        if (this.success) {
            this.code = SUCCESS;
        } else {
            this.code = FAUIL;
        }
    }

    public BaseResult(boolean isSuccess, String msg,String token, Object obj) {
        this.success = isSuccess;
        this.message = msg;
        this.resultObj = obj;
        this.token = token;
        if (this.success) {
            this.code = SUCCESS;
        } else {
            this.code = FAUIL;
        }
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResultObj() {
        return resultObj;
    }

    public void setResultObj(Object resultObj) {
        this.resultObj = resultObj;
    }

    public int getCode(){
        return code;
    }

    public void setCode(int code){
        this.code = code;
    }

}
