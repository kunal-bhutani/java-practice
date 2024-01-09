import java.util.*;
public class lec_1
{
    
    // static int val = 5;
    public static void main (String arg[])
    {
    // System.out.println("hello");
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
        int n = sc.nextInt();
    int arr[]=new int [n];
    //   int ar []={9,8,7,6,5};
    for(int i = 0 ; i<n ; i++)
    {
         arr[i] = sc.nextInt();
    }
    for(int j : arr)
    {
        System.out.println(j);
    }
    // System.out.println(arr);
}

}