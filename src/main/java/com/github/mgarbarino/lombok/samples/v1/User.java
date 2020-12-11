package com.github.mgarbarino.lombok.samples.v1;

/**
 * Version 1
 */
public class User {
    public int    id;
    public String firstName;
    public String secondName;
    public String lastName;
    public String getUserData() {
        return Integer.toString(id) + " " + firstName + " " + secondName + " " + lastName;
    }
}
