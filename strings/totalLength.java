// in it we will take input of string in array and calculate the total length of the character

import java.util.*;
public class totalLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("enter no of name you want to enter");
        int n = sc.nextInt();
        int totalLength = 0 ;
        String str[] = new String[n];
        
        for(int i = 0 ; i<str.length ; i++)
        {
            str[i] = sc.next();
            totalLength+= str[i].length();
        }
        
        System.out.println(totalLength);
    }
}
