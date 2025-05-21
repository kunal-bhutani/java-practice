package greedy;

// in it we will find how many job can be performed
import java.util.*;

class Job {
    int index;
    int start;
    int end;

    public Job(int idx, int str, int ed) {
        index = idx;
        start = str;
        end = ed;
    }

}

public class activitySelection {

    public static void main(String[] args) {
        {
        // Scanner sc = new Scanner(System.in);
        // ArrayList<Job> al = new ArrayList<>();
        // System.out.println("enter the number of jobs");
        // int n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        //     int str = sc.nextInt();
        //     int ed = sc.nextInt();

        //     al.add(new Job(i, str, ed));
        // }

        // Collections.sort(al, (a, b) -> {
        //     return a.end - b.end;
        // });
        // int jobLast = Integer.MAX_VALUE;

        // for (Job jb : al) {
        //     System.out.println(jb.start + "->" + jb.end);
        //     jobLast = Math.min(jobLast, jb.end);
        // }
        // System.out.println(jobLast);
        // int maxJob = 1;
        // for (Job jb : al) {
        //     if (jb.start >= jobLast) {
        //         System.out.println(jb.index + ")");
        //         maxJob++;
        //     }
        // }
        // System.out.println(maxJob);

        }
        // my code^^^^

         int start[] = {1,3,0,5,8,5};
         int end [] = {2,4,6,7,9,9};

         int activity[][] = new int[start.length][3];
         for(int i = 0 ; i < start.length ; i++) {
            activity[i][0]=i;
            activity[i][1]=start[i];
            activity[i][2]=end[i];

         }
         Arrays.sort(activity,Comparator.comparingDouble(o->o[2]));
         ArrayList<Integer> act = new ArrayList<>();
         int maxAct = 1;
         act.add(activity[0][0]);
         int lastJob = activity[0][2];
        //  System.out.println(activity.length);
         for(int i = 1 ; i<activity.length;i++){

            if(activity[i][1]>=lastJob)
            {
                maxAct++;
                act.add(i);
                lastJob=activity[i][2];
            }
        }
            System.out.println("max no of activity->"+maxAct);
            System.out.println("activity->"+act);



    }

}
