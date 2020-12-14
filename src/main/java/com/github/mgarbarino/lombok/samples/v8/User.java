package com.github.mgarbarino.lombok.samples.v8;

import lombok.Builder;
import lombok.Value;

/**
 * Version 8
 */
@Value @Builder(toBuilder = true)
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
