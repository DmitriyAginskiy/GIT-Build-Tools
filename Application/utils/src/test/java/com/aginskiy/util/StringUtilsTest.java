package com.aginskiy.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        boolean actual = StringUtils.isPositiveNumber("-5");
        assertFalse(actual);
    }
}