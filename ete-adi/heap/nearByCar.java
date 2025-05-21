package heap;
import java.util.*;

public class nearByCar {
    public static class Cars implements Comparable<Cars> {
        int index;
        int distSq;

        public Cars(int index, int distSq) {
            this.index = index;
            this.distSq = distSq;
        }

        @Override
        public int compareTo(Cars c2) {
            return this.distSq - c2.distSq;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Cars> pq = new PriorityQueue<>();

        int arr[][] = { { 3, 3 }, { 5, -1 }, { 2, 4 } };
        int k = 2;

        for (int i = 0; i < arr.length; i++) {
            int distSq = (arr[i][0] * arr[i][0]) + (arr[i][1] * arr[i][1]);
            // System.out.println(distSq);
            pq.add(new Cars(i, distSq));
        }

        for (int i = 0; i < k; i++) {
            System.out.println("c"+pq.peek().index+"->"+pq.peek().distSq);
            pq.remove();
            System.out.println(pq.size());
        }

    }

}
