/*
 * Course: CS1011 - Saikath Bhattacharya
 * Fall 2022
 * Homework 7 - Time
 * Name: Adam Haile
 * Created: 10/18/22
 */
package SDI.weekseven;

/**
 * The TimeDriver class, which sets the time with the Time class, then calls to print
 * the time
 */

public class TimeDriver {
    public static void main(String[] args) {
        Time time = new Time();

        final int eight = 8;
        final int fiftyNine = 59;
        time.setHours(eight);
        time.setMinutes(fiftyNine);
        time.setSeconds(0);
        time.printTime();
    }
}
