import java.util.Arrays;

public class TwodArrayBoolean {
    public static void main(String[] args) {
            int[][] arr = {
                    {1, 3,5,7},
                    {10,11,16,20},
                    {23,30,34,60}
            };

            System.out.println(SearchTwoDArray(arr , 6));
        }

        static boolean SearchTwoDArray ( int[][] matrix, int target){
            int rEnd = matrix.length - 1;
            int rStart = 0;
            int cAns = -1;
            int c = matrix[0].length - 1;
            while (rStart <= rEnd) {
                int mid = rStart + (rEnd - rStart) / 2;
                if (matrix[mid][0] <= target && target <= matrix[mid][c]) {
                    cAns = binarySearch(matrix[mid], 0, c, target);
                    if(cAns != -1){
                        return true ;
                    }else{
                        return  false ;
                    }
                } else if (matrix[mid][0] > target) {
                    rEnd = mid - 1;
                } else if (matrix[mid][0] < target) {
                    rStart = mid + 1;
                }
            }
            return false;
        }

        static int binarySearch ( int[] arr, int start, int end, int target){
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return -1;
        }
    }
