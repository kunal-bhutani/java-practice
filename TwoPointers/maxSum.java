// two pointer que we have to find the max sum of given k consecutive numbers in an array

package TwoPointers;
7

import java.util.*;


public class maxSum {
    public static int findMax (int k , int arr[]){
        int a = 0 ;
        int b = a + k;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        if (arr.length == 0){
            return 0;
        } else if(k > arr.length && k >= 0){
            for(int i = 0 ; i < arr.length ; i++){
                sum += arr[i];
            }
            return sum;
        } else{
            while (b < arr.length) {
                for(int i = a ;i <= b ; i++){
                    sum += arr[i];
                }
                if (sum > max){
                    max = sum;
                }
                a++;
            }
            return max;
        }
        
    }
    public static void main(String[] args) {

        System.out.println("hello new world");
        int arr[] = {-1,2,3,3,4,5,-1};
        System.out.println(findMax(4, arr));
    }
}
