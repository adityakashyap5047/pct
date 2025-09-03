import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number of rows
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        
        System.out.println("Output:");
        printStarPattern(n);
        
        scanner.close();
    }
    
    public static void printStarPattern(int n) {
        // First part: decreasing pattern from n to 1
        for (int i = n; i >= 1; i--) {
            // Print leading spaces to center the pattern
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Second part: increasing pattern from 2 to n
        for (int i = 2; i <= n; i++) {
            // Print leading spaces to center the pattern
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
