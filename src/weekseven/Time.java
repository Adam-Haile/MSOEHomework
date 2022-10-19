/*
 * Course: CS1011 - Saikath Bhattacharya
 * Fall 2022
 * Homework 7 - Time
 * Name: Adam Haile
 * Created: 10/18/22
 */

package weekseven;

/**
 * The Time class, which houses the variables of hours, minutes, and seconds. Can set them and
 * also print the time according to what those are set to.
 */

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    //**********************************************************

    /**
     * Sets the hours of Time
     * @param hours Integer
     */
    public void setHours(int hours) {
        this.hours = hours;
    }

    /**
     * Sets the minutes of Time
     * @param minutes Integer
     */
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    /**
     * Sets the seconds of Time
     * @param seconds Integer
     */
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    //************************************************************

    /**
     * Prints out the set time, with formatting so every number has at least 2 places
     */
    public void printTime() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }
}