package com.rainbow.tony.guice.demo;

/**
 * Foo
 *
 * @author tony
 * @copyright rainbow
 * @description Foo
 * @date 2020-05-08
 */
class Foo {
    /**
     * We need a Database to do some work
     */
    private Database database;

    Foo() {
        // Ugh. How could I test this? What if I ever want to use a different
        // database in another application?
        this.database = new Database("/path/to/my/data");
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }
}