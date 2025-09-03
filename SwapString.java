import java.util.Scanner;

public class SwapString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input string 1: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Input string 2: ");
        String str2 = scanner.nextLine();
        
        String temp = str1;
        str1 = str2;
        str2 = temp;
        
        System.out.println("Output string 1: " + str1);
        System.out.println("Output string 2: " + str2);
        
        scanner.close();
    }
}
