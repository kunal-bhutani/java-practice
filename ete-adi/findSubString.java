import java.util.*;

public class findSubString {


    public static void findPattern(String str, String pattern){
        int strLen = str.length();
        int pattLen = pattern.length();
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 0 ; i<=(strLen-pattLen) ;i++)   // string - pattern length by this it will not go out of bound
        {
            if(pattern.equals(str.substring(i, i+pattLen))){

                list.add(i);
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string and pattern");

        String str = sc.nextLine();
        String pattern = sc.nextLine();

        findPattern(str,pattern);
    }
    
}
