// in it we will check whether array is in asending order or not

import java.util.*;

public class CheckAsending {

    public static boolean checkArr(int arr[])
    {
        for(int i = 0 ; i<arr.length; i++)
        {
            if(arr[i]>arr[i+1])
            {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[5];

        System.out.println("Enter arr of lenght 5");

        for(int i = 0 ; i<5 ; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(checkArr(arr));
    }


}
