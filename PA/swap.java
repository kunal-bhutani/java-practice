 class swap {
    public static void swaping (int a , int b)
    {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value in the function is ");
        System.out.println("value of a is = "+a +" value of b is = "+ b);
    }

    public static void arrSwap (int arr1[],int arr2[])
    {
        int temp[] = arr1;
        arr1 = arr2;
        arr2 = temp;
        System.out.println("it is by swap function");
        for(int i : arr1)
        {
            System.out.print(i+" ");
        }
        System.out.println();
         for(int j : arr2)
        {
            System.out.print(j+" ");
        }
        
        
    }

    public static void minmax(int arr0[]){
        
        
        
    }
    public static void main (String arg [])
    {
        int arr1[] =  new int[5];
            for(int i = 0 ; i<5 ;i++)
            {
                arr1[i] = i+1;
            }
            
        int arr2[] = new int [5];
        for(int i = 0 ; i<5;i++)
        {
            arr2[i] = i+5;
        }
        // int a = 10 ;
        // int b = 5;
        // swaping(a, b);
        arrSwap(arr1, arr2);

        System.out.println();
           System.out.println("it is in main ");
        for(int i : arr1)
        {
            System.out.print(i+" ");
        }
        System.out.println();
         for(int j : arr2)
        {
            System.out.print(j+" ");
        }

        // ***********************************************

        // System.out.println("value in the main function is ");
        // System.out.println("value of a is = "+a +" value of b is = "+ b);

        // ************************************************

            // int arr0[] = {7,4,3,5,2};
            
        



        
    }
    
}
