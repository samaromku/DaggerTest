package ru.savchenko.andrey.gradletest.entities;

/**
 * Created by Andrey on 19.08.2017.
 */
public class User {
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static class Builder{
        private String firstName;
        private String lastName;

        public Builder firstName(String val){
            this.firstName = val;
            return this;
        }

        public Builder lastName(String val){
            this.lastName = val;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    private User(Builder builder){
        this.lastName = builder.lastName;
        this.firstName = builder.firstName;
    }
}
