package com.github.mgarbarino.lombok.samples.v1;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import org.junit.Before;

/**
 * Test v1 class
 */
public class UserTest {

    final int    id = 1234;
    final String firstName = "John";
    final String secondName = "";
    final String lastName = "Galt";
    final User   user1 = new User();
    final User   user2 = new User();

    @Before
    public void BeforeTests() {
        user1.id = id;
        user1.firstName = firstName;
        user1.secondName = secondName;
        user1.lastName = lastName;
        user2.id = id;
        user2.firstName = firstName;
        user2.secondName = secondName;
        user2.lastName = lastName;
    }

    @Test
    public void testUserData() {
        assertEquals(
            user1.id + " " +
            user1.firstName + " " +
            user1.secondName + " " +
            user1.lastName,
            user1.getUserData()
        );
    }

    @Test @Ignore
    public void testEquals() {
        assertEquals(user1, user2);
    }

    @Test @Ignore
    public void testHashCode() {
        assertTrue(user1.hashCode() == user2.hashCode());
    }

    @Test @Ignore
    public void testToString() {
        assertEquals(user1, user2);
    }

}
