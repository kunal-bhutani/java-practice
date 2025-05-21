package hashing;
// in it we find the element which exist most number of time
import java.util.*;

public class majorityElement {
// method 1
    public static void printMaxM1(int arr[]) {
        int value = arr.length / 3;
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(value);
        int last = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if (arr[i] == last)
                break;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > value) {
                System.out.print(arr[i] + " ");
            }
            last = arr[i];
        }
    }
// method 2
    public static void printMaxM2(int arr[]){
        int value = arr.length/3;
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<arr.length; i++){

            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        for(int i : map.keySet()){
            if(map.get(i)>value){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        // printMaxM1(arr);
        printMaxM2(arr);

    }

}
