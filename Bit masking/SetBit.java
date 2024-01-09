import java.util.*;

public class SetBit {

    public static int totalBit (int num)
    {
        int count = 0 ;
        while(num>0)
        {
            if((num & 1) != 0)
            {
                count++;
                
            }
            num = num>>1;
            
        }
        return count;
    }
    public static void main(String[] args) {
        // System.out.println(totalBit(15));

        int x = 3 , y = 4 ;
        System.out.println( "before swap x : "+x +" y : " + y );

        x = x^y;
        y = x^y ;
        x = x^y;
                System.out.println( "after swap x : "+x +" y : " + y );


    }
}