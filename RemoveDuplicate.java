import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("array = ");
        String input = scanner.nextLine();
        
        int[] array = parseArray(input);

        int[] result = removeDuplicates(array);
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        
        scanner.close();
    }
    
    public static int[] parseArray(String input) {
        input = input.trim().replaceAll("[{}]", "");
        String[] parts = input.split(",");
        
        int[] array = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            array[i] = Integer.parseInt(parts[i].trim());
        }
        
        return array;
    }
    
    public static int[] removeDuplicates(int[] array) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
        for (int num : array) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        
        return result;
    }
}
