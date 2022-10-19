package weekSix;

import java.util.Scanner;

public class VendingMachine {

    double balance = 0;

    public void insertMoney(Scanner in) {
        System.out.println("Amount of money inserted: ");
        String money = in.nextLine();
        try {
            Double.parseDouble(money);
        } catch(NumberFormatException e) {
            System.out.println("Invalid Payment, must be a valid positive number.");
        }

        double val = Double.parseDouble(money);
        if(val < 0) {
            System.out.println("Invalid Payment, must be a valid positive number.");
        } else {
            this.balance += val;
            System.out.format("\nCurrent Balance: $%.2f\n", this.balance);
        }
    }

    public void selectItem(Scanner in) {

        if(this.balance == 0) {
            System.out.println("No balance has been added yet!");
            return;
        }

        System.out.println("Price of selected item: ");
        String item = in.nextLine();
        try {
            Double.parseDouble(item);
        } catch(NumberFormatException e) {
            System.out.println("Invalid selection, must be a valid positive number.");
            return;
        }

        double val = Double.parseDouble(item);

        if(val <= 0) {
            System.out.println("Invalid selection, must be a valid positive number.");
            return;
        }

        if(val > this.balance) {
            System.out.println("You don't have enough to purchase this item.");
            return;
        }

        this.balance -= val;

        int quarters = 0, dimes = 0, nickels = 0, pennies = 0;
        while(balance >= 0.25) {
            quarters++;
            balance -= 0.25;
        }
        while(balance >= 0.1) {
            dimes++;
            balance -= 0.1;
        }
        while(balance >= 0.05) {
            nickels++;
            balance -= 0.05;
        }
        while(balance > 0) {
            pennies++;
            balance -= 0.01;
        }

        System.out.format("\nYour Change" +
                "\n=========" +
                "\nQuarter(s): %d" +
                "\nDime(s): %d" +
                "\nNickel(s): %d" +
                "\nPenny(ies): %d\n\n", quarters, dimes, nickels, pennies);

    }
}
