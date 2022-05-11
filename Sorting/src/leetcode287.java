/*
// Cyclic sort

Return the repeated integer in nums array , there will only be one repeated integer and all integer value will range from 1 to n .

Input  : integer array nums with only one number repeated
Output : integer which is repeated inside the array nums.

Test cases ;

Input  : [1,3,4,2,2]
Output :  2

Input  : [3,1,3,4,2]
Output :  3

Input  : [1,2,1]
Output :  1

Input  : [1,1]
Output :  1

Algo :

Apply cylic sort on integer array and then check for the repeated number.
    return the value at the index which is not statisfying the check condition.

*/
public class leetcode287 {

    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums) {
        int i =  0 ;
        while(i < nums.length){
            if(nums[i] != i + 1){
                if(nums[i] != nums[nums[i]-1]){
                    swap(nums , i , nums[i]-1) ;
                }else{
                    return nums[i] ;
                }
            }
            else{
                i++ ;
            }
        }

        return -1 ;
    }

   static void  swap(int[] nums , int first , int second ){
        int temp = nums[first] ;
        nums[first] = nums[second] ;
        nums[second] = temp ;
    }

}
