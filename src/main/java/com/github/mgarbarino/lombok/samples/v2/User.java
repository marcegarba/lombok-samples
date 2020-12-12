package com.github.mgarbarino.lombok.samples.v2;

/**
 * Version 2
 */
public class User {
    private int id;
    private String firstName;
    private String secondName;
    private String lastName;

    /**
     * Constractor.
     * 
     * @param id         Id of the User
     * @param firstName  First name
     * @param secondName Second name
     * @param lastName   Last name
     */
    public User(int id, String firstName, String secondName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    /**
     * Obtain the user data, as a string.
     * 
     * @return the user data
     */
    public String getUserData() {
        return Integer.toString(id) + " " + firstName + " " + secondName + " " + lastName;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the secondName
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * @param secondName the secondName to set
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
