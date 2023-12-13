package Task3;

import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
/*
explain------------------
The BankAccount class represents a user's bank account.
It has a private field balance to store the account balance.
The constructor initializes the balance with the provided initialBalance.
getBalance method returns the current balance.
deposit method adds the specified amount to the balance.
withdraw method subtracts the specified amount from the balance if there are sufficient funds.*/


class ATM {
    private BankAccount userAccount;

    public ATM(BankAccount account) {
        this.userAccount = account;
    }

    public void displayMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void operate() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    if (userAccount.withdraw(withdrawalAmount)) {
                        System.out.println("Withdrawal successful. Remaining balance: $" + userAccount.getBalance());
                    } else {
                        System.out.println("Insufficient funds or invalid amount.");
                    }
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    userAccount.deposit(depositAmount);
                    System.out.println("Deposit successful. New balance: $" + userAccount.getBalance());
                    break;
                case 3:
                    System.out.println("Current balance: $" + userAccount.getBalance());
                    break;
                case 4:
                    System.out.println("Exiting ATM. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
/*
explain -----------------
The ATM class represents an ATM machine.
It has a private field userAccount representing the user's bank account.
The constructor initializes the userAccount with the provided account.
displayMenu method prints the available options in the ATM menu.
operate method is the main functionality of the ATM. It prompts the user for their
 choice and performs actions based on the selected option.
 */
public class ATMExample {
    public static void main(String[] args) {
        // Initialize a bank account with an initial balance
        BankAccount userAccount = new BankAccount(1000);

        // Create an ATM instance connected to the user's bank account
        ATM atmMachine = new ATM(userAccount);

        // Operate the ATM
        atmMachine.operate();
    }
}
/*
explain-------------------------
The ATMExample class contains the main method to run the ATM application.
It initializes a bank account with an initial balance of 1000.
Creates an instance of the ATM connected to the user's bank account.
Calls the operate method to start the ATM operation.
 */

