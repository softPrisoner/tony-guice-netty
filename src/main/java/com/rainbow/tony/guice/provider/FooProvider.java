package com.rainbow.tony.guice.provider;

import com.google.inject.Key;
import com.google.inject.Provider;
import com.rainbow.tony.guice.annotation.DatabasePath;
import com.rainbow.tony.guice.demo.Database;
import com.rainbow.tony.guice.demo.Foo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tony
 * @copyright rainbow
 * @description DatabasePath
 * @date 2020-05-08
 */
public class FooProvider implements Provider<Foo> {
    private final Map<String, Provider> guiceMap = new HashMap<>();

    @Override
    public Foo get() {
        Provider<Database> databaseProvider = guiceMap.get(Key.get(Database.class));
        Database database = databaseProvider.get();
        return new Foo(database);
    }
}

class ProvideDatabaseProvider implements Provider<Database> {
    private final Map<String, Provider> guiceMap = new HashMap<>();

    @Override
    public Database get() {
        Provider<String> databasePathProvider =
                guiceMap.get(Key.get(String.class, DatabasePath.class));
        String databasePath = databasePathProvider.get();
//        module.provideDatabase(databasePath);
        return null;
    }
}