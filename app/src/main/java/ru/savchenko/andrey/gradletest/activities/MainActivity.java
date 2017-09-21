package ru.savchenko.andrey.gradletest.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ru.savchenko.andrey.gradletest.App;
import ru.savchenko.andrey.gradletest.R;
import ru.savchenko.andrey.gradletest.entities.User;
import ru.savchenko.andrey.gradletest.managers.UserManager;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Inject UserManager userManager;
    @BindView(R.id.tvHello) TextView tvHello;
    @BindView(R.id.btnSuka) Button btnSuka;

    @OnClick(R.id.btnSuka)void test(){
        Log.i(TAG, "test: " + userManager);
        User user = new User.Builder()
                .firstName("test")
                .lastName("hui")
                .build();
        userManager.addUser(user);
        startActivity(new Intent(this, TestActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        App.getAppComponent().inject(this);
    }
}
