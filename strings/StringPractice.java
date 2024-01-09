import java.util.*;
public class StringPractice {

    public static int checkVowel(String str)
    {
        int count = 0 ;
        for(int i = 0 ; i<str.length(); i++)
        {
            Character chracter = str.charAt(i);
            if( chracter == 'a' || chracter == 'e' || chracter == 'i' || chracter == 'o' || chracter =='u')
            {
                count++;
            }
        }
        return count;
    }
    
    public static void checkAnagram(String str1 , String str2)
    {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length())
        {
            char strA [] = str1.toCharArray();
            char strB [] = str2.toCharArray();

            Arrays.sort(strA);
            Arrays.sort(strB);

            // boolean result = Arrays.equals(strA,strB);

            // if(result)
            // {
            //     System.out.println("they are anagram");
            // }
            // else
            // {
            //     System.out.println("they are not anagram");
            // }

            for(int i = 0 ; i<strA.length; i++)
            {
                if(strA[i] == strB[i])
                {
                    if(i ==  strA.length -1)
                    {
                    System.out.println(" anagram ");
                    }
                    continue;
                    
                }
                else{
                    System.out.println("not a anagram lol");
                    break;
                }
            }
        }
        else
        {
            System.out.println("they are not anagram");
        }

    }
    public static void main(String[] args) {
        
        String str = "aeiou";
        System.out.println(checkVowel(str));

        checkAnagram("earth","heart");
    }
}
