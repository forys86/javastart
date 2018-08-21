package pl.sda.javastart.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void shouldNotShowPasswordInToStringMethod() {
        User firstUser = new User("mariusz","mariusz","haslo");

        String firstUserTest = firstUser.toString();

        assert !firstUserTest.contains("pass");
    }
}