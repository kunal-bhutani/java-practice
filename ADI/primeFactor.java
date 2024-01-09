import java.util.*;

public class primeFactor {

    // last chocolate at which position in circle

    public static int chocolate(int circle , int item , int start)
    {
        int position = (item + start -1)%circle;
        if(position == 0)
        {
            return circle;
        }
        return position;
    }
    // finding the lcm 
    public static void prime(int n )
    {
        int p = 2;
        while (n>0 && p<=n)
        {
            if(n%p == 0 )
            {
                System.out.print(p + " ");
                n = n/p;
            }
            else
            {
                p++;
            }
        }
    }
   // finding the hcf

   public static int gcd(int a , int b)
   {
    int result = Math.min(a, b);

    while (result>0) {
        if(a%result == 0 && b%result==0)
        {
            break;
        }
        result--;
        
    }
    return result;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number ->");
        // int n = sc.nextInt();
        // prime(n);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // System.out.println(gcd(a, b));
        System.out.println(chocolate(a,b,c));



    }
    
}
