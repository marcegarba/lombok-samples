package com.github.mgarbarino.lombok.samples.v2;

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
        assertEquals(user1.toString(), user2.toString());
    }

}
