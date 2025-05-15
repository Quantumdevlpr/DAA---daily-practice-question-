public class Leetcode1827 {
    public static void main(String[] args) {
        int arr[] = {4,2,3,6,1,5};
        int count = 0;
        for(int i = 1; i <arr.length ; i++){
            if(arr[i] <= arr[i-1]){
                count = arr[i-1] - arr[i] + 1;
                arr[i] = arr[i-1] + 1;
            }
        }
        System.err.println("The minimum number of operations required to make the array strictly increasing is: " + count);
    }
}
