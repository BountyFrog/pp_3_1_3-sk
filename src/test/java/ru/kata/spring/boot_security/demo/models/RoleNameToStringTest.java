package ru.kata.spring.boot_security.demo.models;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class RoleNameToStringTest {

    @Test
    void testToString() {
        String roleName1 = "ROLE_ADMIN";
        String roleName2 = "ROLE_USER";
        String result = roleName1.replaceAll("^ROLE_", "");
        System.out.println(result);

        String result2 = roleName2.replaceAll("^ROLE_", "");
        System.out.println(result2);
    }
}