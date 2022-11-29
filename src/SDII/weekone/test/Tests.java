/*
 * Course: CS1021
 * Winter 2022-23
 * Homework 1 - Enums
 * Name: Dr. Taylor
 * Created: 11-04-2022
 */
package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import hailea.Color;
import hailea.ColorDriver;

/**
 * Test suite for CS1021 homework 1
 */
@SuppressWarnings("All")
public class Tests {

    @Test
    void color() {
        Color[] ansiNames = {Color.RESET, Color.BLACK, Color.RED, Color.GREEN, Color.YELLOW,
                Color.BLUE, Color.MAGENTA, Color.CYAN, Color.WHITE};
        String[] ansiCodes = {"\u001B[0m", "\u001B[30m", "\u001B[31m", "\u001B[32m", "\u001B[33m",
                "\u001B[34m", "\u001B[35m", "\u001B[36m", "\u001B[37m"};
        for(int i = 0; i < ansiNames.length; i++) {
            Assertions.assertSame(ansiNames[i].toString(), ansiCodes[i]);
        }
    }

    @Test
    void validateGood() {
        String[] tests = {"1", "-8", "+3", " 7"};
        for(String test : tests) {
            Assertions.assertTrue(ColorDriver.validate(test));
        }
    }

    @Test
    void validateBad() {
        String[] tests = {"one", "- 8", "3.2", "1 bad", "2 3"};
        for(String test : tests) {
            Assertions.assertFalse(ColorDriver.validate(test));
        }
    }

    @Test
    void generatePositive() {
        final String expected = """
                \u001B[34mDecimal: 20
                \u001B[31mHexadecimal: 0x14
                \u001B[32mBinary: 10100\u001B[0m""";
        String actual = ColorDriver.generateRepresentations(20);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void generateNegative() {
        final String expected = """
                \u001B[34mDecimal: -20
                \u001B[31mHexadecimal: 0xffffffec
                \u001B[32mBinary: 11111111111111111111111111101100\u001B[0m""";
        String actual = ColorDriver.generateRepresentations(-20);
        Assertions.assertEquals(expected, actual);
    }
}
