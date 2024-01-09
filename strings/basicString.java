// in it we we try basic code of strings in java

import java.util.*;

public class basicString
{
    public static void main(String[] args) {
        
        String name1 = "kunal";
        String name2 = "lunal";

        String sentence = "hello my self kunal";

        String subStr = sentence.substring(6, 9);

        System.out.println(name1.compareTo(name2));

        System.out.println(subStr);
    }
}