/*
 * Course: CS1021 - 011
 * Winter 2022
 * Homework 1 - Colors and Enumerations
 * Name: Adam Haile
 * Created: 11/28/2022
 */

package hailea;

/**
 * The Color Enumerator method to define all colors
 */

public enum Color {
    /**
     * Reset the color
     */
    RESET("\u001B[0m"),
    /**
     * Black
     */
    BLACK("\u001B[30m"),
    /**
     * Red
     */
    RED("\u001B[31m"),
    /**
     * Green
     */
    GREEN("\u001B[32m"),
    /**
     * Yellow
     */
    YELLOW("\u001B[33m"),
    /**
     * Blue
     */
    BLUE("\u001B[34m"),
    /**
     * Magenta
     */
    MAGENTA("\u001B[35m"),
    /**
     * Cyan
     */
    CYAN("\u001B[36m"),
    /**
     * White
     */
    WHITE("\u001B[37m");

    private final String colors;

    Color(String colors) {
        this.colors = colors;
    }

    /**
     * Return the value of the Enumerable chosen
     * @return String - Returns the color
     */

    public String toString() {
        return colors;
    }
}
