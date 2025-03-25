public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int a = 3;
        System.out.println(binarySearch(arr , a));
    }
    public static boolean binarySearch(int[] arr, int a) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == a) {
                return true;
            }
            if(arr[start] <= arr[mid]) {
                if(a >= arr[start] && a < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(a > arr[mid] && a <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}