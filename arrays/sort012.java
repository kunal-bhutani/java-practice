// in it we have to sort an array contains only 0,1&2 without using sort algo 

import java.util.*;

public class sort012 {
    public static void swap(int i , int j , int arr[])
    {
        int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
    public static void srt012(int arr[])
    {
        int low =0 , mid =0 , high = arr.length-1;
        while (mid<=high) {
            
        
        if(arr[mid]==0)
        {
            swap(low, mid, arr);
            low++;
            mid++;
            
        }
        else if(arr[mid]==1)
        {
            mid++;
        }
        else
        {
            swap(mid, high, arr);
            high--;
        }
    }
    }

    // segrating +ve and -ve integers ex-> 1,-1,3,2,-7,-5,11,6  ans-> (1,3,2,11,6,-1,-7,-5)
    public static void seprate(int arr2[])
    {
        int low = 0 , high =0;
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i = 0 ; i<arr2.length ; i++)
        {
            if(arr2[i]<0)
            {
                list.add(arr2[i]);
            }
        }

        while (low<arr2.length && high<arr2.length) {

            if(arr2[low]>=0)
            {
               low++;
            }
            else
            {
                if(  high > low && arr2[high]>0)
                {
                    swap(low,high,arr2);
                    low++;
                }
                else
                {
                    high++;
                }
            }
            
        }
        int l = arr2.length;

        for(int i = list.size(),j=0 ; i>0;i--,j++)
        {
            arr2[l-i] = list.get(j);
        }

    }


    public static void main(String[] args) {

        int arr[] = {1,2,2,1,0,1,0,0};
        srt012(arr);

        int arr2[]= {1,-1,3,2,-7,-5,11,6};

         for (int i : arr2) {
            System.out.print(i + " ");
            
        }
        System.out.println();
        seprate(arr2);


        for (int i : arr2) {
            System.out.print(i + " ");
            
        }
        
    }
}