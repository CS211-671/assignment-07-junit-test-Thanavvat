package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    @DisplayName("Is Username Method Test")
    public void testIsUsername() {
        User user = new User("John");

        assertTrue(user.isUsername("John"));
    }

    @Test
    @DisplayName("Set Password")
    public void testSetPassword() {
        User user = new User("John", "123456");

        user.setPassword("1212312121");
        assertFalse(user.validatePassword("123456"));
        assertTrue(user.validatePassword("1212312121"));
    }

    @Test
    @DisplayName("Password should not store in plain text")
    public void testPasswordIsNotStoreInPlainText() {
        User user = new User("user01", "plain-p@ssw0rd");
        String actual = user.getPassword();
        String unexpected = "plain-p@ssw0rd";
        assertNotEquals(unexpected, actual);
    }

    @Test
    @DisplayName("Password should be verified by plain text")
    public void testPasswordShouldBeVerified() {
        User user = new User("user01", "plain-p@ssw0rd");
        boolean actual = user.validatePassword("plain-p@ssw0rd");
        assertTrue(actual);
    }
}