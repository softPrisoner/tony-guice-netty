package com.rainbow.tony.guice.base;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description Response
 * @date 2020-05-09
 */
public class Response {
    private Integer code;
    private String message;
    private String data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
