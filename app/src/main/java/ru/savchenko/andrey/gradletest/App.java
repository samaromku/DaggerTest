package ru.savchenko.andrey.gradletest;

import android.app.Application;

import ru.savchenko.andrey.gradletest.interfaces.AppComponent;
import ru.savchenko.andrey.gradletest.interfaces.DaggerAppComponent;

/**
 * Created by Andrey on 19.08.2017.
 */

public class App extends Application {
    private static AppComponent appComponent;

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .build();
    }
}
