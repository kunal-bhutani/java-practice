
public class pattern {

    public static void main(String[] args) {
        // for (int i = 1; i <= 5; i++) {
        // System.out.print(" # ");
        // for (int j = 1; j <= 5; j++) {
        // System.out.print("* ");
        // }
        // System.out.println("$");
        // }

        // *******************************

        // for(int i = 1 ; i<=5 ; i++)
        // {
        // for(int j = 5 ; j>= i ; j--)
        // {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // for(int i = 1 ; i<=5 ; i++)
        // {
        // for(int k = 5 ; k>i ; k--)
        // {
        // System.out.print(" ");
        // }
        // for(int j = 1 ; j<=i ; j++)
        // {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        int k = 5;
        for(int i = 1 ; i<=5 ; i++,k--)
        {
        for(int j=1; j<=5 ; j++)
        {
        if(i==j || j==k)
        {
        System.out.print("*");
        }
        else{
        System.out.print(" ");
        }
        }
        System.out.println();
        }

        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 4; j >= 1; j--) {
        //         System.out.print( ".");
        //     }
        //     for(int k = 1 ; k<=i; k++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

    }

}
