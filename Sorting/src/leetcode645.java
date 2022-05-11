/*
We have an array of numbers which contains all the numbers between 1 to n.
There is one number got duplicated and one number got deleted from the array.
We need to send the repeated and duplicated number in the form of array.

Input : Nums array of integer.
Output : Array containing the repeated and deleted number from nums.


Test Cases :

Input  : [1,2,2,4]
Output : [2,3]

Input  : [1,1]
Output : [1,2]

Input  : [1,2,5,4,4]
Output : [4,3]

Input  : [1, 1 ,2,4]
Output : [1,3]


Algo :



*/

import java.util.Arrays;

public class leetcode645 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,4} ;
        cyclic(arr);
        System.out.println(Arrays.toString(check(arr))) ;
    }

    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length){
            if (arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int[] check(int[] arr){
        int i = 0 ;
        int[] a = {-1,-1} ;
        while(i < arr.length){
            if(arr[i] != i + 1){
               a[0] = arr[i] ;
               a[1] = i+1 ;
            }
            i++ ;
        }
        return a ;
    }
}
