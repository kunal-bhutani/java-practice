package greedy;
import java.util.*;

class Job {
    int price;
    int deadLine;

    Job(int price, int deadLine) {
        this.price = price;
        this.deadLine = deadLine;
    }
}

public class greedy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        int n = sc.nextInt();
        ArrayList<Job> AL = new ArrayList<>();

        int size = 0;

        for (int i = 0; i < n; i++) {
            int price = sc.nextInt();
            int deadLine = sc.nextInt();
            size = Math.max(size, deadLine);
            AL.add(new Job(price, deadLine));

        }

        Collections.sort(AL, (a, b) -> {
            return b.price - a.price;
        });

        int arr[] = new int[size];
        int sum = 0;
        for (Job jb : AL) {
            int x = jb.deadLine;

            for (int i = x - 1; i >= 0; i--) {
                if (arr[i] == 0) {
                    sum += jb.price;
                    arr[i] = jb.price;
                    break;
                }
            }
        }
        System.out.println(sum);
    }

}
