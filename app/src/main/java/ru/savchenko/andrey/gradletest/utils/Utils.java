package ru.savchenko.andrey.gradletest.utils;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

import static android.content.ContentValues.TAG;

/**
 * Created by Andrey on 19.08.2017.
 */
@Module
public class Utils {
    @Inject
    public void test(){
        Log.i(TAG, "test: huiiiiiiiiiiiii");
    }

    @Singleton
    @Provides
    Utils utils(){
        return new Utils();
    }
}
