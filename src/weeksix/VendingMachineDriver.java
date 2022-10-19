package weeksix;

import java.util.Scanner;

public class VendingMachineDriver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char choice;
        boolean done = false;

        VendingMachine vm = new VendingMachine();

        System.out.println("Welcome to John's vending machine!\n");

        do {
            System.out.println("Options: (i)nsert money, (s)elect an item, (q)uit");
            System.out.print("Enter i, s, or q ==> ");
            choice = in.nextLine().charAt(0);

            switch (choice) {
                case 'i':
                case 'I':
                    vm.insertMoney(in);
                    break;
                case 's':
                case 'S':
                    vm.selectItem(in);
                    break;
                case 'q':
                case 'Q':
                    done = true;
                    break;
                default:
                    System.out.println("Invalid selection.");
            }
        } while (!done);

    }
}
