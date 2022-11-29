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
 * The ElevatorDriver - Main file that runs the program
 */

public class ElevatorDriver {
    public static void main(String[] args) {
        boolean run = true;
        System.out.println("\u001B[36mWelcome to Adam's Elevator Simulator!");
        Scanner in = new Scanner(System.in);
        Elevator elevator = new Elevator();
        while(run) {
            System.out.println("\u001B[33mOptions: (s)elect a floor, (f)ire alarm, (q)uit" +
                    "\nEnter s, f, or q ==>");
            String sel = in.nextLine();
            switch (sel) {
                case "s":
                    System.out.println("\u001B[32mPlease enter the floor you'd like to go to " +
                            "(1-100) ==>");
                    elevator.setFloor(in);
                    break;
                case "f":
                    elevator.fireAlarm();
                    break;
                case "q":
                    run = false;
                    break;
                default:
                    System.out.println("\u001B[31mInvalid selection, please choose " +
                            "between s, f, or q");
                    break;
            }
        }
    }
}
