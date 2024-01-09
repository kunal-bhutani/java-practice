// in it we try to input the names and output at screen
import java.util.*;
public class NameArray {

    public static void main (String args [])
    {

        Scanner sc = new Scanner (System.in); 
        String arr[] = new String[5];

        for(int i = 0 ; i<5 ; i++)
        {
            arr[i] = sc.nextLine();
        }

         for(int i = 0 ; i<5 ; i++)
        {
           System.out.println(arr[i]);
        }
    }
    
}
