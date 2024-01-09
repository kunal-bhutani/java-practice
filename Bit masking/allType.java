import java.util.*;
public class allType {

    public static void getbit(int n , int pos)
    {
        int bitMask = 1<<pos;
        int num = n & bitMask;
        if(num>0)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
    }

    public static void setBit (int n , int pos)
    {
        int bitMask = 1<<(pos-1);
        int num = bitMask | n;
        System.out.println(num);
    }

    public static void clear(int n , int pos)
    {
        int bitMask = 1<<(pos -1);
        int bitMaskNot = ~(bitMask);
        int num = n & bitMaskNot;
        System.out.println(num);
    }

    public static void updateBit(int n, int pos)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("type '0' to update zero  or type '1' to update one");
        int check = sc.nextInt();
        if(check == 0)
        {
            clear(n, pos);
        }
        else if( check == 1)
        {
            setBit(n, pos);
        }
        else
        {
            System.out.println("not a vaid option");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number and position");
        int n = sc.nextInt();
        int pos = sc.nextInt();

        // getbit(n,pos-1);
        // setBit(n, pos);
        // clear(n, pos);
        // updateBit(n, pos);

        
    }
    
}
