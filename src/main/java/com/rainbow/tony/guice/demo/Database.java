package com.rainbow.tony.guice.demo;

/**
 * @author tony
 * @copyright rainbow
 * @description Database
 * @date 2020-05-08
 */
public class Database {
    private String path;

    public Database(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
