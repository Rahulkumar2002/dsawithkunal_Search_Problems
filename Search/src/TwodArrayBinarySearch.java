import java.util.Arrays;

public class TwodArrayBinarySearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,15}
        } ;
        int[] result = SearchTwoDArray(arr , 10) ;
        System.out.println(Arrays.toString(result));
    }

    static int[] SearchTwoDArray( int[][] matrix , int target){
        int rEnd = matrix.length - 1;
        int rStart = 0 ;
        int cAns = -1 ;
        int c = matrix[0].length - 1;
        while(rStart <= rEnd){
            int mid = rStart + (rEnd - rStart) /2 ;
            if(matrix[mid][0] <= target && target <= matrix[mid][c]){
                cAns = binarySearch(matrix[mid] , 0 , c , target) ;
                return new int[]{mid , cAns} ;
            }else if (matrix[mid][0] > target ){
                rEnd = mid -1 ;
            }else if (matrix[mid][c] < target){
                rStart = mid + 1 ;
            }
        }
        return new int[]{-1,cAns} ;
    }

    static int binarySearch(int[] arr , int start , int end , int target){
        while(start <= end ){
            int mid = start + (end - start )/2 ;
            if (arr[mid] == target){
                return mid ;
            }else if (arr[mid] < target){
                start = mid + 1 ;
            }else {
                end = mid - 1 ;
            }
        }
        return -1 ;
    }


}
