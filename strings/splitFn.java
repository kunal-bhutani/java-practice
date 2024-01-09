import java.util.*;
public class splitFn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String arr [] = input.split(" ");
        for(String ele : arr)
        {
            System.out.println(ele);
        }

        int max = 0 ;

        for(int i = 0 ; i<arr.length; i++)
        {
            int length = arr[i].length();
             max = Math.max(length,max);
        }

        System.out.println("String with max length is ->>"+max);


    }
    
}
