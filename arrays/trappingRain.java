// in it we have given non-negative integer and we have to find the total water trapped in the bars

import java.util.*;

public class trappingRain {
    public static void maxWater(int arr[]) {
        int n = arr.length;
        int trappedWater = 0;
        int lmax[] = new int[n];
        int rmax[] = new int[n];
        lmax[0] = arr[0];
        rmax[n-1] = arr[n - 1];

        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(arr[i], lmax[i - 1]);
        }

        for (int i = n - 2; i >= 0; i--) {
            rmax[i] = Math.max(arr[i], rmax[i + 1]);
        }

        System.out.print("lmax -> ");
        for (int ele : lmax) {
            System.out.print("|" + ele);
        }

        System.out.println();
                System.out.print("rmax -> ");

        for (int ele : rmax) {
            System.out.print("|" + ele);
        }
        System.out.println();
        for (int i = 0; i < n ; i++) {
            trappedWater += Math.min(lmax[i], rmax[i]) - arr[i];
            System.out.println("\\("+i+"\\)"+"trapped water -> "+trappedWater);
        }

        System.out.println("final water trapped -> "+trappedWater);

    }

    public static void main(String[] args) {

        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };

        maxWater(arr);

    }

}
