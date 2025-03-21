
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,12,5,7,2};
        System.out.println("Unsorted Array : " + Arrays.toString(arr));
        selectionSort(arr);
        System.err.println("Sorted array" + Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        
            for (int i = 0; i < arr.length; i++) {
               
                int last = arr.length - i - 1;
                int maxIndex = MaxIndex(arr, 0, last);
                swap(arr, maxIndex, last);
            }
        
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int MaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
