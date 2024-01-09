import java.util.*;

class Item {
    int weight;
    int value;

    Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

public class Greedy2 {

    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        ArrayList <Item> Al = new ArrayList<>();
        // Item itm = new Item();
        System.out.println("enter the number of items ");
        int n = sc.nextInt();

        // System.out.println("enter your data");
        for(int i = 0 ; i<n ; i++)
        {
            int weight = sc.nextInt();
            int value = sc.nextInt();
            Al.add(new Item(weight, value));
        }

        
        Collections.sort(Al,(a,b)->{
            return ((b.value/b.weight)-(a.value/a.weight));
        });
        System.out.println();
       
         System.out.println("enter your target");
         int target = sc.nextInt();
        float sum = 0;
          for(Item itm : Al)
        {
             if(target >= itm.weight){
                sum+= itm.value;
                target-=itm.weight;
            }
            else{
                int x = itm.weight/target;
                sum+= itm.value/x;
                target-=itm.weight/x;
                break;
            }
        }
           
         
         System.out.println("max sum = " + sum);
    }
}