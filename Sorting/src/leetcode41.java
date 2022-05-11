/*
Unsorted array nums and return the smallest missing positive integer.

Input  : non sorted integer array ranging -2^31 <= nums[i] <= 2^31 - 1
Output : smallest positive mising number means value should be greater then zero

Test cases :

Input : [1,2,0]
Output : 3

Input : [3,4,-1,1]
Output : [2]

Input : [7,8,9,11,12]
Output : 1

Algo :


*/


import java.util.Arrays;

public class leetcode41 {
    public static void main(String[] args) {
        int[] arr = {1} ;
        cyclic(arr);
        System.out.print(check(arr));
    }
    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length){
            if ( arr[i] <= arr.length && arr[i] > 0 && arr[i] != arr[arr[i] - 1]) {
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

    static int check(int[] arr){
        int i = 0 ;
        while (i < arr.length){
            if (i+1 != arr[i]) {
                return i + 1;
            }
            i++ ;
        }
        return -1 ;
    }
}
