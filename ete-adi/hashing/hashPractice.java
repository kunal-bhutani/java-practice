package hashing;
// basic paractice of hash

import java.util.*;
public class hashPractice {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(5);
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(1);

        System.out.println("size of the set is -> "+set.size());
        System.out.println(set);
        System.out.println(set.contains(2));
        set.remove(1);
        System.out.println("new set is ->"+set);

        // System.out.println("ele at 2->"+set.);
        System.out.println("triversing set using iterator");

        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
}
