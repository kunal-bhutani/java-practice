package hashing;
// in it we will do the implementaion of the hash map in java which is basically use to store the key value pair in java
import java.util.*;
public class hashMap {
    public static void main(String args[])
    {
        // HashMap<String,Integer>map = new HashMap<>();
        
        // map.put("India",120);
        // map.put("china",60);
        // map.put("us",80);

        // System.out.println(map);

        // System.out.println(map.get("china"));

        // map.remove("china");
        // System.out.println(map);

        HashMap <String,Integer> map = new HashMap<>();
        map.put("cng",80);
        map.put("petrol",69);
        map.put("diesel",99);
        System.out.println(map);
        System.out.println(map.containsKey("cng"));
        System.out.println(map.containsValue(80));
        // map.remove("cng");
        System.out.println(map);

        System.out.println("map using iterator");

        Set<String> keys =map.keySet();

        for(String key:keys){
            System.out.println(key +" "+map.get(key));
        }

    }
    
}



