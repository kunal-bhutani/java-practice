public class algos {

    public static void kmp_Algo() {

        String str1 = "Geeksleetcode";
        String str2 = "leet";
        System.out.print(str1.indexOf(str2));
    }

    public static void Zvalue_algo() {

        String str1 = "Geeks For Geeks";
        String str2 = "Geek";
        int index = str1.indexOf(str2);
        while (index != -1) {
            System.out.println("Found at " + index);
            index = str1.indexOf(str2, str2.length() + index);
        }
    }


    

    public static void main(String[] args) {
        // kmp_Algo();
        // Zvalue_algo();

    }

}
