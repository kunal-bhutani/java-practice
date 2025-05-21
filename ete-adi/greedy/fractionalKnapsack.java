package greedy;
import java.util.*;
public class fractionalKnapsack {

    public static void main(String[] args) {
        int val[]={60,100,120};
        int weight []={10,20,30};

        int w = 50;
        int sum = 0;
         
        double ratio[][] =new double[val.length][2];

        for(int i=0 ; i<val.length;i++){
            ratio[i][0] = i;
            ratio[i][1]= val[i]/(double)weight[i];
        }

        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));

        for(int i = ratio.length-1;i>=0;i--){
            if(w>=weight[i]){
                w-=weight[i];
                sum+=val[i];
                
            } else {
                // val+= (ratio[i][1]*w);
            }
        }
    }
    
}
