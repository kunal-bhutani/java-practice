// in it we will do the implementation of hash set
import java.util.*;
public class hashSet {
    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(1); 
        set.add(3);

        // set.remove(1);
        System.out.println(set.contains(3));

        // Iterator it = set.iterator();
        // while(it.hasNext())
        // {
        //     System.out.println(it.next());

        // }
    }
    
}
