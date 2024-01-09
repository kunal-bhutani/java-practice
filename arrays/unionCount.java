// in it we have to give the count of the union array
import java.util.*;

public class unionCount {

    // public static int count(int a[], int b[])
    // {
    //     int min,max,count=0;
    //     if(a.length == b.length)
    //     {
    //         min = a.length; max = a.length;
    //     }
    //     else{
    //         min = Math.min(a.length,b.length);
    //         max = Math.max(a.length,b.length);
    //     }

    //     for(int i = 0 ; i<max ; i++)
    //     {
    //         for(int j = 0 ; j<min ; j++)
    //         {
    //             if( a[i] == b[j])
    //             {
    //                 count++;
    //             }
    //         }
    //     }

    //     int ans = (max+min) - count;
    //     return ans;
    // }

    // public static int doUnion(int a[],int b[]) 
    // {
    //     int n = a.length;
    //     int m = b.length;
    //     int min , max ,count =0 , ans;
    //     if(n == m )
    //     {
    //         min = n ;
    //         max = m;
    //     }
    //     else
    //     {
    //         min = Math.min(n,m);
    //         max = Math.max(n,m);

    //         System.out.println(min + " " + max);
    //     }
    //                 System.out.println(min + " " + max);

    //     for(int i = 0 ; i<max ; i++ )
    //     {
    //         for(int j = 0 ; j<min ;j++)
    //         {
    //             if (i >= n || j >= m) {
    //                 // Check whether i is greater than or equal to max or j is greater than or equal to min
    //                 break;
    //             }
    //             if(a[i] == b[j])
    //             {
    //                 count++;
    //                 break;
    //             }
    //         }
    //     }
    //     ans = (n+m)-count;
        
    //     return ans;
    // }

    public static int doUnion(int a[], int n, int b[], int m) 
    {
        int min , max ,count =0 , ans;
        if(n == m )
        {
            min = n ;
            max = n;
        }
        else
        {
            min = Math.min(n,m);
            max = Math.max(n,m);
        }
        
        for(int i = 0 ; i<max ; i++ )
        {
            for(int j = 0 ; j<min ;j++)
            {
                if(i>=n || j>=m)
                {
                    break;
                }
                if(a[i] == b[j])
                {
                    count++;
                    break;
                }
            }
        }
        ans = (n+m)-count;
        
        return ans;
    }
    public static void main(String[] args) {
        int b[] = {1,2,3,4,5};
        int a[] = {10,20,30,40,5,60,9,7,6};

        // System.out.println(count(a, b));

        System.out.println(doUnion(a,5, b,9));

        
    }
}
