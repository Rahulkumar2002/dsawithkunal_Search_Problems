public class RotationCount {
    public static void main(String[] args) {
        int result = 0;
        int[] arr = { 15,18,2, 3, 6, 12};
        result = rotationCount(arr);
        System.out.println("Result : " + (result+1));
    }

    static int rotationCount(int[] arr) {
        int start = 0;
        int ans = -1 ;
        int end = arr.length -1 ;
        while(start <= end ) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                ans = mid ;
                break ;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                ans = mid - 1;
                break ;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans ;
    }
    }

