
import java.util.*;
public class StringSort 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String str []= {"hello", "Hi ", "by", "cu"};

        String str1 = "hello , how , are ,you ";
        
        
        String splited [] = str1.split(",");

        for( String a : splited)
        {
            System.out.println(a);
        }

        System.out.println(splited.length);

        // char temp [] = new char[str[0].length()];

        // temp= str[0].toCharArray();

        
        // System.out.println(str[0].length());

        // Arrays.sort(str);

        // for(int i = 0 ; i<str.length ; i++)
        // {
        //     System.out.print(str[i] + " ");
        // }

        // System.out.println();
        // for(int i = 0 ; i<5;i++)
        // {
        //     System.out.println(temp[i]);
        // }

        
    }
}