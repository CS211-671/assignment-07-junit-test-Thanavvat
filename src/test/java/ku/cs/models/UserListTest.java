package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();

        userList.addUser("One", "123456");
        userList.addUser("Two", "123456");
        userList.addUser("Three", "123456");

        // TODO: find one of them
        User user = userList.findUserByUsername("Two");

        // TODO: assert that UserList found User
         String expected = "Two";
         String actual = user.getUsername();
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();

        userList.addUser("One", "123456");
        userList.addUser("Two", "123456");
        userList.addUser("Three", "123456");

        // TODO: change password of one user
        assertTrue(userList.changePassword("One", "123456", "654321"));

        // TODO: assert that user can change password
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();

        userList.addUser("One", "123456");
        userList.addUser("Two", "123456");
        userList.addUser("Three", "123456");

        // TODO: call login() with correct username and password
        User actual = userList.login("One", "123456");

        // TODO: assert that User object is found
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();

        userList.addUser("One", "123456");
        userList.addUser("Two", "123456");
        userList.addUser("Three", "123456");

        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("Four", "789789");

        // TODO: assert that the method return null
         assertNull(actual);
    }

}