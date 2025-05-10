/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c32;

import java.util.Scanner;

public class BasicATM {

    private static double balance = 1000.00; // Initial balance
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Basic ATM System!");

        boolean running = true;
        while (running) {
            printMenu();
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    checkBalance();
                    break;
                case "2":
                    deposit();
                    break;
                case "3":
                    withdraw();
                    break;
                case "4":
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option! Please select 1-4.");
            }
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\nPlease choose an option:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Your choice: ");
    }

    private static void checkBalance() {
        System.out.printf("Your current balance is: $%.2f%n", balance);
    }

    private static void deposit() {
        System.out.print("Enter amount to deposit: $");
        String input = scanner.nextLine().trim();

        try {
            double amount = Double.parseDouble(input);
            if (amount <= 0) {
                System.out.println("Deposit amount must be greater than zero.");
                return;
            }
            balance += amount;
            System.out.printf("Successfully deposited $%.2f. New balance: $%.2f%n", amount, balance);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        }
    }

    private static void withdraw() {
        System.out.print("Enter amount to withdraw: $");
        String input = scanner.nextLine().trim();

        try {
            double amount = Double.parseDouble(input);
            if (amount <= 0) {
                System.out.println("Withdrawal amount must be greater than zero.");
                return;
            }
            if (amount > balance) {
                System.out.println("Insufficient balance! Transaction cancelled.");
                return;
            }
            balance -= amount;
            System.out.printf("Successfully withdrew $%.2f. New balance: $%.2f%n", amount, balance);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        }
    }
}

