package com.rainbow.tony.guice.base;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description Request
 * @date 2020-05-09
 */
public class Request {
    private String url;
    private String type;
    private String proxy;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProxy() {
        return proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }
}
