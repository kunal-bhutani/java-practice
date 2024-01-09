//  in it we have to push element at the bottom of the stack

import java.util.*;

public class pushAtBottom {

    // this function is to push element at the bottom

    public static void pushAtBtm(int data , Stack<Integer> s)
    {
        if(s.empty())
        {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBtm(data, s);
        s.push(top);
    }

    // this function is to reverse the stack


    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
       
        pushAtBtm(4, s);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }




    }
    
}
