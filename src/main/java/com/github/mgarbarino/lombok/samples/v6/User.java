package com.github.mgarbarino.lombok.samples.v6;

import lombok.Data;

/**
 * Version 6
 */
@Data
final public class User {
    final private int id;
    final private String firstName;
    final private String secondName;
    final private String lastName;

    /**
     * Obtain the user data, as a string.
     * 
     * @return the user data
     */
    public String getUserData() {
        return Integer.toString(id) +
            " " + firstName +
            " " + secondName +
            " " + lastName;
    }
}
