// in it we will do practice of sorting in java mainly Collections fram work and some important algos

import java.util.*;

public class sorting {

    // in it we will use Arrays.sort() to sort 2 arrays  -> just basic implementation
    public static void sort2array(){
        Integer arr1[]= {5,20,12,30};
        char arr2[] = {'b','d','a','d','c'};

        Arrays.sort(arr1,Collections.reverseOrder());  // it is working with normal sort and also for reversOrder();
        Arrays.sort(arr2);

        // let us check using Collections.sort(null);
        // Collections.sort(arr1);  // this is not applicable on it because it is just for not premitive data type;

        
        System.out.println("this is arr1 ->"+Arrays.toString(arr1));
        
        System.out.println("this is arr2 ->"+Arrays.toString(arr2));
    
    }
    //  in it just basic implementation of Collections frame work
    public static void impCollections(){
        List<Integer> li = new ArrayList<>();
        li.add(3);
        li.add(4);
        li.add(5);
        li.add(2);
        li.add(7);
        li.add(8);

        Collections.sort(li);
        Collections.sort(li,Collections.reverseOrder());
        

        System.out.println(li);

       
    }

    //  this is basic implementatio of merger sort using extra auxallary space 
    public static void mergeBasic(){
        int arr1[] ={ 10 ,20,2};
        int arr2[] = {1,2};

        int arr3 [] = new int[arr1.length + arr2.length];

        for(int i = 0 ; i< arr1.length ; i++){
            arr3[i] = arr1[i];
        }

        for(int i = 0 ; i<arr2.length ; i++){
            arr3[arr1.length+i]= arr2[i];
        }

        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }

    // merge optimized

    public static void mergeOptimized(){

        int arr1[] ={ 10 ,33,67};
        int arr2[] = {1,20};

        int first = arr1.length;
        int second = arr2.length;

        int i = 0 , j= 0 ;
         
        while (i<first && j<second) {
            if(arr1[i] <= arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
            }
            else{
                System.out.print(arr2[j]+ " ");
                j++;
            }
            
        }

        while (i<first) {
            
            System.out.print(arr1[i]+" ");
            i++;
        }
        while (j<second) {
            System.out.print(arr2+" ");
            j++;
        }


        
    }
    
    public static void main(String[] args) {
        
        // sort2array();   // this is basic implementatio of sorting of 2 arrays using Arrays.sort();

        impCollections();   // this is to use use basic collectons on list

        // mergeBasic();   // this is just basic implementation of merge sort 

        // mergeOptimized();   // merge sort optimized solution
    }
    
}
