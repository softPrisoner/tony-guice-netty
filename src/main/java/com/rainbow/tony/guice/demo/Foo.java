package com.rainbow.tony.guice.demo;

import com.google.inject.Inject;
import com.google.inject.Provides;
import com.rainbow.tony.guice.annotation.DatabasePath;

/**
 * Foo
 *
 * @author tony
 * @copyright rainbow
 * @description Foo
 * @date 2020-05-08
 */
public class Foo {
    /**
     * We need a Database to do some work
     */
    private Database database;

    @Inject
    public Foo(Database database) {
        this.database = database;
    }

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

    @Provides
    Database provideDatabase(
            // We need the @DatabasePath String before we can construct a Database
            @DatabasePath String databasePath) {
        return new Database(databasePath);
    }
}