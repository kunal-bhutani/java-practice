package hashing;

// in it we will do union of 2 arrays  using hashset and intersection of 2 array

import java.util.*;

public class unionOf2 {
    public static void intersection(int arr1[], int arr2[]) {
        HashSet<Integer> set1 = new HashSet<>();
        // HashSet<Integer> set2 = new HashSet<>();
        int count=0;

        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            if (set1.contains(arr2[i])) {
                // set2.add(arr2[i]);
                count++;
                set1.remove(arr2[i]);
            }

        }

        // System.out.println(set2.size());
        System.out.println(count);
        
    }

    public static void merge(int arr1[], int arr2[]) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        System.out.println(set.size());
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        merge(arr1, arr2);
        System.out.println("intersection");
        intersection(arr1,arr2);

    }

}
