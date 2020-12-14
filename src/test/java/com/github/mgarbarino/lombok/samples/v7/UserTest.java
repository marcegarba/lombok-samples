package com.github.mgarbarino.lombok.samples.v7;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

/**
 * Test v6 class
 */
public class UserTest {

    final int    id = 1234;
    final String firstName = "John";
    final String secondName = "";
    final String lastName = "Galt";
    final User   user1 = new User(id, firstName, secondName, lastName);
    final User   user2 = new User(id, firstName, secondName, lastName);

    @Before
    public void BeforeTests() {
    }

    @Test
    public void testUserData() {
        assertEquals(
            Integer.toString(user1.getId()) + " " +
            user1.getFirstName() + " " +
            user1.getSecondName() + " " +
            user1.getLastName(),
            user1.getUserData()
        );
    }

    @Test
    public void testGetId() {
        assertEquals(user1.getId(), id);
        assertEquals(user1.getId(), user2.getId());
    }

    @Test
    public void testGetFirstName() {
        assertEquals(user1.getFirstName(), firstName);
        assertEquals(user1.getFirstName(), user2.getFirstName());
    }

    @Test
    public void testGetSecondName() {
        assertEquals(user1.getSecondName(), secondName);
        assertEquals(user1.getSecondName(), user2.getSecondName());
    }

    @Test
    public void testGetLastName() {
        assertEquals(user1.getLastName(), lastName);
        assertEquals(user1.getLastName(), user2.getLastName());
    }
}
