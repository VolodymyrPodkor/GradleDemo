package org.example;

public class User {

    private String name;
    private String lastName;

    public User(String firstName, String secondName) {
        this.name = firstName;
        this.lastName = secondName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
