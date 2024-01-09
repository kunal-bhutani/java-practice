import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyDS{
    int num;
    String name;
    String companyName;

    MyDS(int num,String name,String compnayName){
        this.num = num;
        this.name = name;
        this.companyName = compnayName;
    }

}

public class Bit {
    public static void main(String args[]) throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        MyDS m[] = new MyDS[2];

        for(int i = 0;i<2;i++){

            int k = Integer.parseInt(sc.readLine());
            String na = sc.readLine();
            String cm = sc.readLine();

            m[i] = new MyDS(k, na, cm);
        }
        for(int i = 0;i<2;i++){
            System.out.println(m[i].name + " " + m[i].num + " " + m[i].companyName);
        }
    }
}