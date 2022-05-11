import java.util.Arrays;

// This method is not a stable sorting method because in case of repeated numbers it will not sort them in their given order .
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 0};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxIn = maxIndex(arr, 0, arr.length - i - 1);
            swap(arr, maxIn, arr.length - i - 1);
        }
    }

    static int maxIndex(int[] arr, int start, int last) {
        int max = start;
        int i = 0;
        while (i <= last) {
            if (arr[i] > arr[max]) {
                max = i;
            }
            i++;
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
