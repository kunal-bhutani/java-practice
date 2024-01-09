import java.util.*;

public class waste
{
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("hello",1);
        hm.put("hi",88);
        hm.put("kkrh hai",65);
        // System.out.println(hm.remove("hi"));
        // System.out.println(hm);/

        // for(Map.Entry<String,Integer> e : hm.entrySet())
        // {
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        // }

        for(Map.Entry<String,Integer> e : hm.entrySet())
        {
            System.out.println(e.getKey()+ ' '+e.getValue());
        }
    }
}