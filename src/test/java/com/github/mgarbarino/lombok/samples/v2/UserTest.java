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
    public void testSetId() {
        final int changeId = id + 173;
        user1.setId(changeId);
        assertEquals(user1.getId(), changeId);
        assertNotEquals(user1.getId(), user2.getId());
    }

    @Test
    public void testSetFirstName() {
        final String changeFirstName = firstName + " Anthony";
        user1.setFirstName(changeFirstName);
        assertEquals(user1.getFirstName(), changeFirstName);
        assertNotEquals(user1.getFirstName(), user2.getFirstName());
    }

    @Test
    public void testSetSecondName() {
        final String changeSecondName = "Julious";
        user1.setSecondName(changeSecondName);
        assertEquals(user1.getSecondName(), changeSecondName);
        assertNotEquals(user1.getSecondName(), user2.getSecondName());
    }

    @Test
    public void testSetLastName() {
        final String changeLastName = "Rand";
        user1.setLastName(changeLastName);
        assertEquals(user1.getLastName(), changeLastName);
        assertNotEquals(user1.getLastName(), user2.getLastName());
    }
}
