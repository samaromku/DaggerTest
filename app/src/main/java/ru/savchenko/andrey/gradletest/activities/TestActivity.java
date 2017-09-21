package ru.savchenko.andrey.gradletest.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

import ru.savchenko.andrey.gradletest.App;
import ru.savchenko.andrey.gradletest.R;
import ru.savchenko.andrey.gradletest.managers.UserManager;

/**
 * Created by Andrey on 19.08.2017.
 */

public class TestActivity extends AppCompatActivity {
    private static final String TAG = "TestActivity";
    @Inject UserManager userManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        App.getAppComponent().inject(this);
        Log.i(TAG, "onCreate: " + userManager.getUsers());
    }
}
