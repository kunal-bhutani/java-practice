public class search {

    public static void display(int arr[])
    {
        for(int i : arr)
        {
            System.out.print(i +" ");
        }
    }

    public static void find (int arr[])
    {
        for(int i = 0 ; i<arr.length ; i++)
        {

        }
    }

    public static int[] reverseArr (int arr[])
    {
        int rev []= new int[arr.length];
        int j = arr.length-1;

        for(int i = 0 ; i<arr.length;i++)
        {
            rev[i] = arr[j];
            j--;
        }
        return rev;
    }
    public static void main(String args[])
    {
        
    }
    
}
