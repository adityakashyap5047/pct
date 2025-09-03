import java.util.Scanner;

public class FindCharacterPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input String: ");
        String inputString = scanner.nextLine();
        
        System.out.print("Find Character: ");
        char findChar = scanner.next().charAt(0);

        findCharacterPositions(inputString, findChar);
        
        scanner.close();
    }
    
    public static void findCharacterPositions(String str, char ch) {
        boolean found = false;
        System.out.print("Output: ");
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                if (found) {
                    System.out.print(", ");
                }
                System.out.print(i + 1);
                found = true;
            }
        }
        
        if (!found) {
            System.out.print("-1");
        }
        
        System.out.println();
    }
}
