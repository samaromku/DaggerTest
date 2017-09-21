package ru.savchenko.andrey.gradletest.managers;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.savchenko.andrey.gradletest.entities.User;

/**
 * Created by Andrey on 19.08.2017.
 */

@Module
public class UserManager {
    private List<User>users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addUser(User user){
        users.add(user);
    }


    @Provides
    @Singleton
    UserManager userManager(){
        UserManager userManager = new UserManager();
        userManager.users = new ArrayList<>();
        return userManager;
    }
}
