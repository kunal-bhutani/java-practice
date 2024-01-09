import java.util.*;
public class functions {
    //********************** function to return name ***********************

    // public static void printName(String name)
    // {
    //     System.out.println(name);
    // }



    // ****************** function to return product of 2 numbers *******

    // public static int productOftwo(int a , int b)
    // {
        // return a*b;
    // }


    // ****************************find the factorial of the number *************************

    // public static int factorial(int n)
    // {
    //     int fact = 1;
    //     if(n == 0 || n==1)
    //     {
    //         return 1;
    //     }
        
    //     while(n>0)
    //     {
    //         fact*=n;
    //         n--;
    //     }

    //     return fact;
    // }


    // **************************** fibbonachi series  ******************************

    public static void printFibbo(int n)
    {
        if(n == 0)
        return ;
        int a=0, b=1, c;

        for(int i = 1 ; i<= n ; i++)
        {
            System.out.print(a + " ");
            c = a+b;
            a= b;
            b=c;
        }
    }

    

    public static void main (String args[])
    {

        Scanner sc = new Scanner(System.in);


        // System.out.println("enter your name");
        // String name = sc.nextLine();

        // printName(name);

        // System.out.println("product of the number is "+productOftwo(2, 3));


        // System.out.println(factorial(5));


        printFibbo(8);

    }
}
