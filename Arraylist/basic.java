import java.util.*;

public class basic {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(3);
        list.add(5);

        list.add(0,-1);
        list.remove(3);
        list.set(1,8);
        // Collections.sort(list);
        // Collections.reverse(list);
        // System.out.println(list.isEmpty());
        // System.out.println(list.size());

        // Object arr [] = list.toArray();
        // System.out.println(arr.length);

        // list.clear();
        System.out.println(list.indexOf(5));

        

        System.out.println(list);

    }
}