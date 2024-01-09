import java.util.*;

public class largestNO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // Size of the array
            int[] coins = new int[n];

            for (int i = 0; i < n; i++) {
                coins[i] = sc.nextInt(); // Input the elements of the array
            }

            String largestValue = arrangeCoinsForLargestValue(coins);
            System.out.println(largestValue);
        }
    }

    public static String arrangeCoinsForLargestValue(int[] coins) {
        // Convert the integer array to a string array for sorting
        String[] coinsStr = new String[coins.length];
        for (int i = 0; i < coins.length; i++) {
            coinsStr[i] = Integer.toString(coins[i]);
        }

        // Sort the string array in descending order to maximize the value
        Arrays.sort(coinsStr, (a, b) -> (b + a).compareTo(a + b));

        // Concatenate the sorted strings to form the largest value
        StringBuilder result = new StringBuilder();
        for (String str : coinsStr) {
            result.append(str);
        }

        return result.toString();
    }
}