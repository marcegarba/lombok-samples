package com.github.mgarbarino.lombok.samples.v7;

import lombok.Value;

/**
 * Version 7
 */
@Value
public class User {
    int id;
    String firstName;
    String secondName;
    String lastName;

    /**
     * Obtain the user data, as a string.
     * 
     * @return the user data
     */
    public String getUserData() {
        return Integer.toString(id) + " " + firstName + " " + secondName + " " + lastName;
    }
}
