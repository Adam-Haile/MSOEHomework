/*
 * Course: CS1011 - Saikath Bhattacharya
 * Fall 2022
 * Homework 8 - Elevator
 * Name: Adam Haile
 * Created: 10/27/22
 */

package SDI.weekeight;
import java.util.Scanner;

/**
 * The Elevator class - Stores data for ElevatorDriver
 */
public class Elevator {

    int currentFloor = 1;
    static final int MAX_FLOOR = 100;

    /**
     * Changes the current floor of the user in the elevator
     * @param in Scanner: Takes in the floor inputted from ElevatorDriver
     */
    public void setFloor(Scanner in) {
        String floor = in.nextLine();
        try {
            int flr = Integer.parseInt(floor);
            if(flr >= 1 && flr < MAX_FLOOR) {
                int distance;
                if(flr > currentFloor) {
                    distance = flr - currentFloor;
                    System.out.print("\u001B[33m\nGoing up.. ");
                    for(int i = 1; i <= distance; i++) {
                        currentFloor++;
                        System.out.print(currentFloor + ".. ");
                    }
                } else {
                    distance = currentFloor - flr;
                    System.out.print("\u001B[33m\nGoing down..");
                    for(int i = 1; i <= distance; i++) {
                        currentFloor--;
                        System.out.print(currentFloor + ".. ");
                    }
                }
                System.out.println("Ding!");
            } else {
                System.out.println("\u001B[31mInvalid floor selection, must be between 1 & 100");
            }
        } catch (NumberFormatException e) {
            System.out.println("\u001B[31mInvalid floor selection, must be between 1 & 100");
        }
    }

    /**
     * Pulls the fire alarm and forces the elevator to the first floor
     */

    public void fireAlarm() {
        System.out.println("\u001B[31mDanger! You must exit the building now!");
        currentFloor = 1;
    }
}
