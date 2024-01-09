import java.util.*;

public class tag {
   
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println();
        Scanner sc = new Scanner (System.in);
        
        StringBuilder sb = new StringBuilder("");
      String name = sc.next();
        for(int i = 0 ; i<name.length(); i = i+2)
        {
            if(i+1<name.length())
            {
                
                int cmp = Character.compare(name.charAt(i),name.charAt(i+1));
                if(cmp>=0)
                {
                    sb.append(name.charAt(i));
                }
                else
                {
                    sb.append(name.charAt(i+1));
                }
            }
            else if(i<name.length())
            {
                sb.append(name.charAt(i));
            }
        }

        System.out.println(sb);
        
}
    
}
