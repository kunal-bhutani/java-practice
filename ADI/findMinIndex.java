import java.util.*;
public class findMinIndex {

    public static int find(int arr[] , int n)
    {
        int minI = 0 ;
        for(int i = 1 ; i<n ; i++)
        {
            if(arr[i]<arr[minI])
            {
                minI = i;
            }
        }
        return minI;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0 ; i< n ;i++)
        {
            arr[i]= sc.nextInt();

        }

        System.out.println(find(arr, n));
        }
    
}

// 30
// 3 9 10 12 21 27 37 46 54 59 64 74 78 88 94 100 102 106 108 117 122 126 129 138 144 150 153 160 170 2