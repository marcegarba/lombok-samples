package com.github.mgarbarino.lombok.samples.v5;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

/**
 * Test v5 class
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
    public void testEquals() {
        assertEquals(user1, user2);
        assertEquals(user1, user1);
        assertNotEquals(user1, new Object());
        assertSame(user1, user1);
        assertNotSame(user1, user2);
    }

    @Test
    public void testHashCode() {
        assertTrue(user1.hashCode() == user2.hashCode());
    }

    @Test
    public void testToString() {
        assertEquals(user1.toString(), user2.toString());
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
