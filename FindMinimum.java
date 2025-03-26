public class FindMinimum {
    int[] arr = {4,2,3,6,1,5};
    public static void main(String[] args) {
        FindMinimum obj = new FindMinimum();
        System.out.println(obj.findMinimum());
    }
    public int findMinimum() {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[start] <= arr[end]) {
                return arr[start];
            }
            int next = (mid + 1) % arr.length;
            int prev = (mid + arr.length - 1) % arr.length;
            if(arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return arr[mid];
            }
            if(arr[start] <= arr[mid]) {
                start = mid + 1;
            } else if(arr[mid] <= arr[end]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
