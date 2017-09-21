package ru.savchenko.andrey.gradletest.interfaces;

import javax.inject.Singleton;

import dagger.Component;
import ru.savchenko.andrey.gradletest.activities.MainActivity;
import ru.savchenko.andrey.gradletest.activities.TestActivity;
import ru.savchenko.andrey.gradletest.managers.UserManager;
import ru.savchenko.andrey.gradletest.utils.Utils;

/**
 * Created by Andrey on 19.08.2017.
 */
@Component(modules = {Utils.class, UserManager.class})
@Singleton
public interface AppComponent {
    void inject(MainActivity mainActivity);

    void inject(TestActivity testActivity);
}
