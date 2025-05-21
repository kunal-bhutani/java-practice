import java.util.*;

public class SetBit {

    // in it we will count total number of set bit in a number
    public static int totalBit(int num) {
        int count = 0;
        while (num != 0) {
            if ((num & 1) != 0) {
                count++;

            }
            num = num >> 1;

        }
        return count;
    }

    // in it we are swaping number using xor operator 
    public static void swapUsingXOR(int x, int y) {

        System.out.println("before swap x : " + x + " y : " + y);

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("after swap x : " + x + " y : " + y);
    }

    public static void main(String[] args) {
        System.out.println("total no of set bit-> " + totalBit(15));
        swapUsingXOR(3, 4);

    }
}