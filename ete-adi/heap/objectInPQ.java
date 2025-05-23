package heap;
// in it we will store object in PriorityQueue

import java.util.*;

  
public class objectInPQ {
    // ************************** learn syntax *****************************
   public static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
        // ******************************************************************

    }

    public static void main(String[] args) {

        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("a", 4));
        pq.add(new Student("b", 5));
        pq.add(new Student("c", 2));
        pq.add(new Student("d", 12));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove();

        }

    }

}
