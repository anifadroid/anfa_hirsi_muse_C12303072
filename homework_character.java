import java.util.Scanner;

public class homework_character {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter numbers to add.");
        System.out.println("Type 'n' to exit.");

        while (true) {
            System.out.print("Enter an integer: ");
            String userInput = input.next(); // read as string

            // Check if the input is 'n' (to stop)
            if (userInput.equalsIgnoreCase("n")) {
                break; // exit the loop
            }

            try {
                // Try converting to integer
                int number = Integer.parseInt(userInput);
                sum += number;
            } catch (NumberFormatException e) {
                // If input is not a number, print invalid input
                System.out.println("Invalid input");
            }
        }

        System.out.println("Sum is " +sum);


    }
}
