// 2
// 3
// apple
// banana
// orange
// 2
// cat
// dog

// orangebananaapple
// dogcat

import java.util.*;

class helloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println();
        Scanner sc = new Scanner(System.in);

        int inputs = sc.nextInt();
        while (inputs-- > 0) {
            int n = sc.nextInt();
            String str[] = new String[n];
            for (int i = 0; i < n; i++) {
                str[i] = sc.next();
            }

            Arrays.sort(str);
            // Collections.reverse(Arrays.asList(str));

            ArrayList<String> strList = new ArrayList<>(Arrays.asList(str));
            Collections.reverse(strList);

            for (String ele : strList) {
                System.out.print(ele);
            }
        }

    }
}