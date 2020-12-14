package com.github.mgarbarino.lombok.samples.v8;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

/**
 * Test v8 class
 */
public class UserTest {

    final int    id = 1234;
    final String firstName = "John";
    final String secondName = "";
    final String lastName = "Galt";
    final User   user1 = new User(id, firstName, secondName, lastName);
    final User   user2;

    /**
     * Using builder pattern for creating user2
     */
    public UserTest() {
        user2 = User.builder()
            .id(id)
            .firstName(firstName)
            .secondName(secondName)
            .lastName(lastName)
            .build();
    }

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

    @Test
    public void testBuilder() {
        final int anotherId = id + 38;
        final var user3 = user1.toBuilder().id(anotherId).build();
        assertNotEquals(id, user3.getId());
        assertEquals(anotherId, user3.getId());
        assertEquals(firstName, user3.getFirstName());
        assertEquals(secondName, user3.getSecondName());
        assertEquals(lastName, user3.getLastName());
    }
}
