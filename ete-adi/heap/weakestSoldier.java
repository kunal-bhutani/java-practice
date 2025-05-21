package heap;

import java.util.PriorityQueue;

public class weakestSoldier {

    public static class Soldier implements Comparable<Soldier> {
        int soldierNo;
        int index;

        public Soldier(int soldierNo, int index) {
            this.soldierNo = soldierNo;
            this.index = index;
        }

        @Override
        public int compareTo(Soldier s2) {
            if (this.soldierNo == s2.soldierNo) {
                return this.index - s2.index;
            } else {
                return this.soldierNo - s2.soldierNo;
            }

        }
    }

    public static void main(String[] args) {
        PriorityQueue<Soldier> pq = new PriorityQueue<>();

        int arr[][] = { { 1, 0, 0, 0 }, { 1, 1, 1, 1 }, { 1, 0, 0, 0 }, { 1, 0, 0, 0 }, };

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                count+= arr[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Soldier(count, i));
        }
        
        for(int i = 0 ; i<2 ; i++)
        {
            System.out.println(pq.peek().index);
            pq.remove();
        }
    }

}
