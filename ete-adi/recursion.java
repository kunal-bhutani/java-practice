// practice of basic recursion problems 

import java.util.*;

public class recursion {

    public static int fact(int n){

        if(n==1) return 1;
        return n* fact(n-1);
        
    }

    public static int fibo(int n){
        if(n==1 || n==2) return 1;

       int x =  fibo(n-1)+fibo(n-2);
        System.out.print(x+" ");

        return x;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        // System.out.println(fact(n));
        System.out.println(fibo(n));

        
    }
    
}
