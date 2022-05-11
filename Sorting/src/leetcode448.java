import java.util.ArrayList;
import java.util.Arrays;

/*
Return all the element in the form of array which is not present in the given array. All elements should be in the range of [1,n]. Numbers can be repeated.

Input : nums integer array
Output : list of numbers which is not present in nums.

Test Cases :

Input : [4,3,2,7,8,2,3,1]
Output : [5,6]

Input : [1,1]
Output : [2]

Input  : [1,1,1,1,4,3]
Output : [2,5,6]

Input : [2,2]
Output : [1]

Algo :

Apply cyclic sort on nums
    there should be another check for repeated numbers
    if we have same number at the swaping index then we will ignore the current index and           increment the value of i by 1

Then after sorting of the array we will check for the index == value - 1
    return all the values don't satisfies the above condition.


*/

public class leetcode448 {
    public static void main(String[] args) {
        int[] arr = {1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(check(arr) ) ;
    }

    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // value - 1 == index
//            if (i != arr[i] - 1) {
                if (arr[i] != arr[arr[i] - 1]) {
                    swap(arr, i, arr[i] - 1);
//                } else {
//                    i++;
//                }
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

    static ArrayList<Integer> check(int[] arr) {
        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < arr.length) {
            if (i + 1 != arr[i]) {
                list.add(arr[i]);
            }
            i++ ;
        }
        return list;
    }
}
