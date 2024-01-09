
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class StringRev {
   

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println();
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
           
        char inputArr [] = str.toCharArray();
         char result [] = new char[inputArr.length];
         
         for(int i= 0 ; i<inputArr.length;i++)
         {
             if(inputArr[i] == ' ')
             {
                 result[i] = ' ';
             }
         }
         
         int j=inputArr.length-1;
         
         for(int i = 0 ;i<inputArr.length ;i++)
         {
             if(inputArr[i] != ' ')
             {
             if(inputArr[j] ==' ')
             {
                 j--;
             }
             result[j] = inputArr[i];
             j--;
             }
             
         }
      
      System.out.println(  String.valueOf(result));
        
        
    }
}