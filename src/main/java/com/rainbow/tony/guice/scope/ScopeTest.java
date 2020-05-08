package com.rainbow.tony.guice.scope;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Provider;
import com.rainbow.tony.guice.module.ApplebeesModule;

import java.util.Objects;

/**
 * @author tony
 * @copyright rainbow
 * @description ScopeTest
 * @date 2020-05-08
 */
public class ScopeTest {
    public static void main(String[] args) {
        //Not singleton
        Injector injector = Guice.createInjector(new ApplebeesModule());
        Provider<Bar> provider = injector.getProvider(Bar.class);
        Provider<Grill> provider2 = injector.getProvider(Grill.class);

        if (Objects.nonNull(provider)) {
            Bar bar = provider.get();
            System.out.println("#" + bar);
            bar.printBar();
        }

        if (Objects.nonNull(provider2)) {
            Grill grill = provider2.get();
            System.out.println("#" + grill);
            grill.printGrill();
        }
    }
}
