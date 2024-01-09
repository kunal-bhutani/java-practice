public class reverseArr {


// this is my method to reverse an array
    public static void reverse(int num[])
    {
        int n = num.length - 1;

        for(int i = 0 ; i<n/2 ; i++)
        {
            int temp = num[i];
            num[i]   = num[n-i];
            num[n-i] = temp;   
           }

           for(int ele : num)
           {
            System.out.println(ele);
           }
    }

    // this is method by apna cllg lect

    public static void reverseArry(int arr[])
    {
        int first = 0 , last = arr.length-1;
        while(first<last)
        {
            // swap 
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
        
        for(int ele : arr)
       {
        System.out.println(ele);
       }

    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        
        // reverse(arr);
        reverseArry(arr);
    }
}