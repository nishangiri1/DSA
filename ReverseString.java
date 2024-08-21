import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Create a StringBuilder object with the input string
        StringBuilder sb = new StringBuilder(inputString);

        // Reverse the string using the reverse() method
        sb.reverse();

        // Print the reversed string
        System.out.println("Reversed string: " + sb.toString());

        scanner.close();
    }
}