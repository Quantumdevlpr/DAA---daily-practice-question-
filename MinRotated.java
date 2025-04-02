public class MinRotated {
    public static void main(String[] args) {
        int[] arr  = {3,4,5,1,2};
        int result = MinElement(arr);
    }
    public int MinElement(int[] arr) {
        int start  = 0;
        int end = arr.length -1;
        while(start < end ){
        int mid = start + (end - start )/2;
        if(arr[mid]>arr[end]){
            start = mid + 1;
        }

        }
    }
}
