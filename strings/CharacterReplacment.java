// in it we will replace character of a particular string link  change i insted of e

import java.util.*;

public class CharacterReplacment
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String str1 = sc.next();
        String str2 = "";

        for(int i = 0 ; i<str1.length(); i++)
        {
            if(str1.charAt(i) == 'e')
            {
                str2+='i';
            }
            else{
                str2+=str1.charAt(i);
            }
        }
        System.out.println("old string : "+ str1);
        System.out.println("new string : "+str2);
    }
}