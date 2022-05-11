import java.util.Arrays;
/*
*
* Algo :
* In cyclic sort first we will be checking if our value - 1 is equal's to current index.
* If it is equal then we will increase our index by 1.
* If it not equal then we will swap the value at index with the value at index(value - 1).
*   we won't increase our current index.
* At the end of this while loop we will have a sorted array.
*
*
*/



public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1,5,4,3,2,0};
        cyclic(arr) ;
        System.out.println(Arrays.toString(arr));
    }

     static void cyclic(int[] arr) {
         int i = 0 ;
         while(  i < arr.length ){
             // value - 1 == index
             if(i != arr[i]){
                 swap(arr, i, arr[i]);
             }else{
                 i++ ;
             }
         }
     }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first] ;
        arr[first] = arr[second] ;
        arr[second] = temp ;
    }
}
