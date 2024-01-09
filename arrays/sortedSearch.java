// in it we have to search element in matrix we have 3 approaches 
// 1. brute force tc -> O(n^2)
// 2. row wise  tc -> O(n logn) go row wise and apply binary search in each row
// 3. stair case  in it we use one of((o,m-1) / (n-1,0) ) to start search

// in it we discuss 3rd approach and its tc -> O(n+m)

import java.util.*;

public class sortedSearch {

    public static boolean search(int arr[][], int key) {
        int row = 0, col = arr[0].length - 1;
         while(row<arr.length && col>=0){
        if (key == arr[row][col]) {
            System.out.println("key is at (" + row + "," + col + ")");
            return true;
        } else if (key < arr[row][col]) {
            col--;
        } else {
            row++;
        }
    }

        System.out.println("key ni mili");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of your 2D square matrix");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("start entering your array");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        System.out.println(search(arr, 33));
    }

}
