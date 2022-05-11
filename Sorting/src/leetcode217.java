/*
Cyclic sort


Given a array nums in which a number can be repeated if repeated then return true else false.

Input  : nums array with may or may not repeated numbers
Output : true if a number is repeated else false

Test Cases :

Input : [1,2,3,1]
Output : true

Input : [1,2,3,4]
Output : false

Input : [1,1,1,3,3,4,3,2,4,2]
Output : true

Input : [1]
Output : false

Input : [-1,2,3,-1]
Output : true

Algo :

*/

public class leetcode217 {
    public static void main(String[] args) {
        int[] arr = {-1,2,3,-1};
        cyclic(arr);
        System.out.println( check(arr));
    }

    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if ( arr[i] > 0  && arr[i] != arr[arr[i] - 1]) {
                swap(arr, arr[i], arr[arr[i] - 1]);
            }else  {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static boolean check(int[] arr){
        int i = 0 ;
        if (arr[i] != i + 1){
            if (arr[i] == arr[arr[i]-1]){
                return true ;
            }
        }
        return false ;
    }
}
