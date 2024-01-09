// in it we create userName form email 

import java.util.*;
public class userName {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter your email : ");
        String str1 = sc.next();
        String str2 = "";

        for(int i = 0 ; i<str1.length();i++)
        {
            if(str1.charAt(i) == '@')
            {
                break;
            }
            else{
                str2+=str1.charAt(i);
            }
        }

        System.out.println("your email is : "+str1);
        System.out.println("your userName is : "+str2);
    }
    
}
