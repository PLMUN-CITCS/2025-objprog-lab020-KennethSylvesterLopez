import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        // Loop to display the menu until the user chooses to exit
        do {
            // Display the menu
            displayMenu();

            // Get the user's choice
            System.out.print("Enter your choice (1-3): ");
            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                input.next(); // Clear invalid input
                System.out.print("Enter your choice (1-3): ");
            }
            choice = input.nextInt();

            // Handle the user's menu choice
            handleMenuChoice(choice, input);

        } while (choice != 3);

        // Close the scanner
        input.close();
    }

    // Method to display the menu options
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }

    // Method to handle the user's choice and perform corresponding actions
    public static void handleMenuChoice(int choice, Scanner input) {
        switch (choice) {
            case 1:
                greetUser(); // Call greetUser method
                break;
            case 2:
                checkEvenOrOdd(input); // Call checkEvenOrOdd method
                break;
            case 3:
                System.out.println("Exiting program. Goodbye!"); // Exit message
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
        }
    }

    // Helper method to display a greeting message
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    // Helper method to get an integer and check if it's even or odd
    public static void checkEvenOrOdd(Scanner input) {
        System.out.print("Enter an integer: ");
        while (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            input.next(); // Clear invalid input
            System.out.print("Enter an integer: ");
        }
        int number = input.nextInt();

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
}
