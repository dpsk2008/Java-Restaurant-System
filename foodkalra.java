/*
 * Author: Deepinder
 * Date: 22 Feb 2025
 *
 * Programming Assignment: Restaurant Food Ordering System
 * Program Description: This will allow people to online order food by seeing thier price of each item people can get the total price, tax and tips through this selecting 
 *               
 * Honor Code: I pledge that I will not cheat, help others to cheat, plagiarize, or otherwise
 * engage in any misrepresentation of my work.
 */


import java.util.Scanner;

public class foodkalra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display menu
        System.out.println("Food Menu");
        System.out.println("Item     Price (in dollars)");
        System.out.println("1  Chicken Curry    10.69");
        System.out.println("2  Shrimp Curry     14.25");
        System.out.println("3  Naan             3.59");
        System.out.println("4  Chai             2.45");
        System.out.println("5  Crabs            7.24");
        System.out.println("6  Lamb Biriyani    15.59");
        System.out.println("7  Veg Biriyani     11.27");
        System.out.println("8  Gobi Manchurian  10.35");
        System.out.println("9  Chana Masala     9.45");
        System.out.println("10 Kheer            4.99");

        // Get number of different dishes
        System.out.print("\nHow many different dishes would you like to order today? ");
        int dishCount = input.nextInt();

        double totalPrice = 0;
        int i = 1;

        // Use a while loop to take multiple dish orders
        while (i <= dishCount) {
            System.out.print("Enter dish " + i + " [1-10]: ");
            int dishNumber = input.nextInt();
            System.out.print("How many servings of dish " + i + " would you like to order? ");
            int servings = input.nextInt();

            double dishPrice = 0;

            // Use a switch statement to assign prices to dishes
            switch (dishNumber) {
                case 1: dishPrice = 10.69; break;
                case 2: dishPrice = 14.25; break;
                case 3: dishPrice = 3.59; break;
                case 4: dishPrice = 2.45; break;
                case 5: dishPrice = 7.24; break;
                case 6: dishPrice = 15.59; break;
                case 7: dishPrice = 11.27; break;
                case 8: dishPrice = 10.35; break;
                case 9: dishPrice = 9.45; break;
                case 10: dishPrice = 4.99; break;
                default: 
                    System.out.println("Invalid dish number. Please restart the order.");
                    return;
            }

            totalPrice += dishPrice * servings;
            i++;
        }

        // Get tax percentage
        System.out.print("Enter the tax %: ");
        double taxPercent = input.nextDouble();
        double taxAmount = (taxPercent / 100) * totalPrice;

        // Ask for tip
        System.out.print("Do you want to add tip? [’y’ - yes or ’n’ - no] ");
        char tipChoice = input.next().charAt(0);
        double tipAmount = 0;

        if (tipChoice == 'y' || tipChoice == 'Y') {
            System.out.print("Enter tip % [0-100]: ");
            double tipPercent = input.nextDouble();
            tipAmount = (tipPercent / 100) * totalPrice;
        }

        // Compute final total
        double finalTotal = totalPrice + taxAmount + tipAmount;

        // Round values to two decimal places manually
        totalPrice = roundTwoDecimals(totalPrice);
        taxAmount = roundTwoDecimals(taxAmount);
        tipAmount = roundTwoDecimals(tipAmount);
        finalTotal = roundTwoDecimals(finalTotal);

        // Display breakdown
        System.out.println("\n------------------------");
        System.out.println("Price: $" + totalPrice);
        System.out.println("Tax (" + taxPercent + "%): $" + taxAmount);
        System.out.println("Tip: $" + tipAmount);
        System.out.println("------------------------");
        System.out.println("Total Amount: $" + finalTotal);
        System.out.println("\nYour order has been placed and will be delivered soon!");

        input.close();
    }

    // Function to manually round a double to two decimal places without using built-in rounding
    public static double roundTwoDecimals(double value) {
        value = value * 100;      // Shift decimal point right
        int intValue = (int)(value + 0.5);  // Add 0.5 and truncate
        return intValue / 100.0;  // Shift decimal point back left
    }
}