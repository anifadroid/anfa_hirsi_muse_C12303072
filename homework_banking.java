import java.util.Scanner;

public class homework_banking {

    static Scanner input = new Scanner(System.in);
    static int balance = 0;

    public static void main(String[] args) {
        System.out.print("Create a 4-digit PIN: ");
        String pin = input.nextLine();

        if (!isValidPin(pin)) {
            System.out.println("Invalid PIN. PIN must be 4 digits.");
            return;
        }

        if (!authenticate(pin)) {
            System.out.println("Too many failed attempts. System locked.");
            return;
        }

        bankingMenu();
    }

    public static boolean isValidPin(String pin) {
        return pin.matches("\\d{4}");
    }

    public static boolean authenticate(String correctPin) {
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter your PIN: ");
            String enteredPin = input.nextLine();

            if (enteredPin.equals(correctPin)) {
                System.out.println("Access granted.\n");
                return true;
            } else {
                attempts++;
                System.out.println("Incorrect PIN. Attempts left: " + (3 - attempts));
            }
        }
        return false;
    }


    public static void bankingMenu() {
        int choice;

        do {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    System.out.println("Thank you for using our banking system.");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (choice != 3);
    }


    public static void deposit() {
        System.out.print("Enter amount to deposit: ");
        int amount = input.nextInt();

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Invalid amount.");
        }
    }


    public static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        int amount = input.nextInt();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }
}