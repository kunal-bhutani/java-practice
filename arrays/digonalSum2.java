// in it trying the digonal sum ;
import java.util.*;
public class digonalSum2 {

    public static int digonalSum(int arr[][])
    {
        int k = arr.length -1;
        int sum = 0;
        for(int row = 0 ; row<arr.length; row++ , k--)
        {
            for(int col = 0 ;  col < arr[0].length ; col++)
            {
                if(row == col || col == k)
                {
                     sum += arr[row][col];
                }
            }
        }
        // base case in which value is overlapping
        // if(arr.length % 2 != 0)
        // {
        //     int z = arr.length/2;
        //     sum -= arr[z][z];
        // }
        return sum;

    }

    // O(n) complexity code fully optimized

    public static int opDigonalSum (int arr[][])
    {
        int sum = 0 ;
        for(int i = 0 ; i< arr.length;i++)
        {
            // primary digonal
         sum += arr[i][i];
         // secondary digonal
         if(i != arr.length-1-i)   // condition for sec dig is i+j = arr.length -1  -> so we can find j in it so j = arr.length-1-i; and this if condition showing when i != to j 
         {
            sum+= arr[i][arr.length -i -1]; // arr.lenght -i-1 = j
         }

        }

        return sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of your 2D square matrix");
        int n = sc.nextInt();
        int arr[][]= new int[n][n];
        System.out.println("start entering your array");
       for(int row = 0 ; row<arr.length; row++ )
        {
            for(int col = 0 ;  col < arr[0].length ; col++)
            {
                arr[row][col] = sc.nextInt();
            }
        } 

                System.out.println(digonalSum(arr));
                System.out.println(opDigonalSum(arr));

        
    }
    
}
