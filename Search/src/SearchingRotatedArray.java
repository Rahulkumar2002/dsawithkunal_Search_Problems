public class SearchingRotatedArray {
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int target = 3;
//            if (arr.length - 1 < 2) {
//                for (int i = 0; i < arr.length; i++) {
//                    if (arr[i] == target) {
////                        return i;
//                        System.out.println(i);
//                    }
//
//                }
////                System.out.println(-1);
//            } else if (arr[0] > arr[arr.length - 1]) {
//                int ans = -1;
//                int PIndex = Peak(arr);
//                if (target < arr[0]) {
//                    ans = binarySearch(arr, target, PIndex + 1, arr.length - 1);
//                     System.out.println(ans);
////                    return ans;
//                } else {
//                    ans = binarySearch(arr, target, 0, PIndex);
//                     System.out.println(ans);
////                    return ans;
//                }
//            } else {
//                System.out.println(binarySearch(arr, target, 0, arr.length - 1));
////                return binarySearch(arr, target, 0, arr.length - 1);
//            }
        if(arr[0] > arr[arr.length - 1]){
            if (arr.length - 1 < 2) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == target) {
//                        return i;
                        System.out.println(i);
                    }

                }
//                System.out.println(-1);
            } else{
                int ans = -1;
                int PIndex = Peak(arr);
                if (target < arr[0]) {
                    ans = binarySearch(arr, target, PIndex + 1, arr.length - 1);
                     System.out.println(ans);
//                    return ans;
                } else {
                    ans = binarySearch(arr, target, 0, PIndex);
                     System.out.println(ans);
//                    return ans;
                }
            }
        }else{
            System.out.println(binarySearch(arr, target, 0, arr.length - 1));
////                return binarySearch(arr, target, 0, arr.length - 1);
        }



    }

    static int Peak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start != end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            } else if (nums[0] > nums[mid]) {
                end = mid - 1;
            } else {
                start = mid;
            }
        }
        return -1;
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
