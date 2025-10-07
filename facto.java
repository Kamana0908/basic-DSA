package FNCTIONS.METHODS;
import java.util.Scanner;

public class facto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();

        // Calculate factorial
        long factorial = 1; // Use long to handle larger results
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Display the result
        System.out.println("The factorial of " + number + " is: " + factorial);

        scanner.close();
    }
}

