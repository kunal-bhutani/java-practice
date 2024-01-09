import java.util.Scanner;

public class mergerSortedArrays {

    // function to merger 2 sorted arrays using merger sort and print same type of
    // element only once

    public static void merger(int a[], int b[], int m, int n) {
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }

            if (a[i] < b[j]) {
                System.out.print(a[i] + " ");
                i++;

            }
            else if (a[i] > b[j]) {
                System.out.print(b[j] + " ");
                j++;
            }
            else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }

        }
        while (i < m) {
            if (i > 0 && a[i] != a[i - 1]) {
                System.out.print(a[i] + " ");
                i++;
            }

        }
        while (j < n) {
            if (j > 0 && b[j] != b[j - 1]) {
                System.out.print(b[j] + " ");
                j++;
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of first arr -> ");
        int a = sc.nextInt();
        int arr1[] = new int[a];

        System.out.println("enter the elements");
        for (int i = 0; i < a; i++) {
            arr1[i] = sc.nextInt();

        }
        System.out.println("enter the size for second array");
        int b = sc.nextInt();

        System.out.println("enter the elements");

        int arr2[] = new int[b];
        for (int i = 0; i < b; i++) {
            arr2[i] = sc.nextInt();

        }

        merger(arr1, arr2, a, b);
    }
}