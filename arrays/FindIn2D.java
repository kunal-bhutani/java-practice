
// in it we will find element in 2d array
import java.util.*;

public class FindIn2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        
        int arr[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println();
                }

                System.out.println("tell me which element you want to find");
                
                int target = sc.nextInt();
        for(int i = 0  ; i<3 ; i++)
       {
        for(int j = 0 ; j<4 ; j++)
        {
            if(arr[i][j] ==  target)
            {
                System.out.println("index: "+(i+1) + "," + (j+1));
            }
        }
       }
    }
    }

