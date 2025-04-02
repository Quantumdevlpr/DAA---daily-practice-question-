public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1,2, 3, 1, 5, 6, 4};
        System.out.println(findPeakElement(arr));
    }
    public static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
