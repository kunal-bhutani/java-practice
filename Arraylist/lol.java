import java.util.*;
public class lol {
    
    public static void main(String[] args) {
        // ArrayList <Integer> list = new ArrayList<>();

        // Stack <Integer> s = new Stack <>();
        // s.push(1);
        // s.push(3);
        // s.push(5);
        // // Collections.reverse(s);
        // // System.out.println(s);
        // s.add(0,8);
        // s.push(6);         
        // s.add(0,90);
        // s.push(88);
        // System.out.println("size : "+s.size());

        // System.out.println("our stack is -->" + s);

        // System.out.println("yes it does ->"+s.contains(90));
        // // while(!s.isEmpty())
        // // {
        // //     System.out.println(s.peek());
        // //     s.pop();
        // // }


        Queue <Integer> q = new LinkedList<>();

        q.add(9);
        q.add(4);
                q.add(5);
        q.add(6);
        q.add(7);
        q.add(2);
        System.out.println(q);
        q.remove();
        System.out.println(q);

        
    }
}
