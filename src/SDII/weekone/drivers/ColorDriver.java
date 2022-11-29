/*
 * Course: CS1021 - 011
 * Winter 2022
 * Homework 1 - Colors and Enumerations
 * Name: Adam Haile
 * Created: 11/28/2022
*/

package hailea;
import java.util.Scanner;

/**
 * The Driver class for the Color Enumeration program
 */
public class ColorDriver {

    public static void main(String[]args){

        String blue = Color.BLUE.toString();
        String red = Color.RED.toString();
        String green = Color.GREEN.toString();
        String reset = Color.RESET.toString();

        System.out.format("""
                Welcome to Number Converter 3000!
                This program will take a decimal number
                and convert it to binary and hexadecimal representations
                %sDecimal will be displayed in blue
                %sHexadecimal will be displayed in red
                %sBinary will be displayed in green%s""", blue, red, green, reset);

        Scanner in = new Scanner(System.in);
        boolean run = true;
        while(run) {
            System.out.println("\nPlease enter a number to convert (or q to quit)");
            String input = in.nextLine();
            if(input.equals("q")) {
                run = false;
                System.out.println("Thank you for using Number Converter 3000!");
            } else {
                if (validate(input)) {
                    System.out.format(generateRepresentations(Double.parseDouble(input)),
                            blue, red, green, reset);
                }
            }
        }
    }

    /**
     * Validates the inputted number to be a valid decimal number
     * @param input String: The inputted string
     * @return boolean: T/F if valid decimal number
     */

    public static boolean validate(String input) {
        try {
            return Double.parseDouble(input) % 1 == 0;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    /**
     * Returns the decimal value with hexadecimal, and binary versions.
     * @param value Integer: The given decimal number to convert
     * @return String: The returned string with the hexadecimal and binary conversions
     */

    public static String generateRepresentations(double value) {
        String blue = Color.BLUE.toString();
        String red = Color.RED.toString();
        String green = Color.GREEN.toString();
        String reset = Color.RESET.toString();

        int val = (int) value;

        String decimal = blue + "Decimal: " + val;
        String hexadecimal = red + "Hexadecimal: 0x" + Integer.toHexString(val);
        String binary = green + "Binary: " + Integer.toBinaryString(val) + reset;

        return String.format("%s\n%s\n%s", decimal, hexadecimal, binary);
    }
}
