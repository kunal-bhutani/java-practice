import java.util.*;
public class findPattern {

    public static void find1(String str , String patt)
    {
        int sL = str.length();
        int pL = patt.length();

        for(int i = 0 ; i<=(sL-pL);i++)
        {
            String sub = str.substring(i,i+pL);

            if(patt.equals(sub))
            {
                System.out.println(i);
            }
        }
    }


        public static void find2(String str , String patt)
        {
            int sL = str.length();
            int pL = patt.length();
            for(int i = 0 ; i<= sL-pL ;i++)
            {
                int j = 0;
                while(  j<pL&&str.charAt(i+j) == patt.charAt(j))
                {
                    if(j+1 == pL)
                    {
                        System.out.println(i);
                    }
                    j++;
                }
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string and pattern");
        String str = sc.nextLine();
        String patt = sc.nextLine();

        find1(str, patt);
        System.out.println(" code by index");
        find1(str, patt);
    }
    // AABAACAADAABAAABAA
    
}
