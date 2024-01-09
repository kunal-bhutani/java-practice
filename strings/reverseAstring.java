public class reverseAstring {
    public static String reverse(String str)
    {
        StringBuilder sb = new StringBuilder("");
        for(int i = str.length()-1; i>=0; i--)
        {
            sb.append(str.charAt(i));
        }
        String st =  sb.toString();
        return st;
    }

    public static void main(String[] args) {
        String str = "kunal";
        System.out.println(reverse(str));
    }
}
