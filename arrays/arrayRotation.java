public class arrayRotation {

    public static void reverse (int arr[],int st , int end)
    {
        while (st<end)
        {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9,4};
        int k = 3;
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr,k,arr.length-1);

        for(int ele : arr)
        {
            System.out.print(ele+ " ");
        }
    }
    
}
