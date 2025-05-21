package heap;
// in it we will do basic implementation of PriorityQueue;

import java.util.*;

public class priorityQue {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(); // in integer it sort in
        // acending order by default
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(4);
        pq.add(7);
        pq.add(3);
        pq.add(2);
        pq.add(9);// O(logn)
        // System.out.println(pq);
        // pq.remove(4); // kyuki dhund kar nikalna hota hai to tc O(logn)
        while (!pq.isEmpty()) {
            System.out.println(pq.peek()); // O(1)
            pq.remove(); // O(logn)
        }
    }

}