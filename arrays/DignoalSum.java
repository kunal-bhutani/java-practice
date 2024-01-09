// in it we find DignoalSum

import java.util.*;

public class DignoalSum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the matrix length");
        int n = sc.nextInt();
        int k = n - 1;

        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++, k--) {
            for (int j = 0; j < n; j++) {

                if (k == j || j == i) {
                    sum += arr[i][j];
                }
            }
        }

        System.out.println(sum);
    }
}
