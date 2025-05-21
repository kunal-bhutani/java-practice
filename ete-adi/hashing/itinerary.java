package hashing;

// find itinerary from ticket basically start to end stations 
// example -> output of the entry is mumbai->delhi->goa->chennai->bengaluru%   
import java.util.*;
public class itinerary {
    public static void findloopM1(){
        HashMap <String,String> map = new HashMap<>();
        map.put("chennai", "bengaluru");
        map.put("mumbai", "delhi");
        map.put("goa", "chennai");
        map.put("delhi", "goa");

        String start = null ;
        for(String key : map.keySet()){
            if(!map.containsValue(key)){
                 start = key;
            }
        }

        // working fine this is done by me 

        // System.out.print(start+"->");
        // for(String key : map.keySet()){
        //     String out = map.get(start);
        //     System.out.print(out +"->");
        //     start = out;
        // }

        // code by apna college

        while(map.containsKey(start)){
            
            System.out.print(start + "->");
            start = map.get(start);
        }
        System.out.print(start);


        // PriorityQueue <Integer> pq = new PriorityQueue<>();

    }
    public static void main(String[] args) {
        findloopM1();
    }
    
}
