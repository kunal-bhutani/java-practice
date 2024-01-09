// in it we will find min and max from an array 

import java.util.*;

public class minMax {
    public static void main(String[] args) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        System.out.println("enter array of size 5");
        for(int i = 0  ; i<5 ; i++)
        {
            arr[i] = sc.nextInt();

        }

        for(int i = 0 ; i<5 ; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }

        System.out.println("min no is = "+ min + " max no is = "+ max);
    
    }
    
}
