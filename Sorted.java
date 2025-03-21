public class Sorted {
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,1};
        for(int i = 1 ; i < arr.length ;i++){
            if(arr[i]>arr[i-1]){
                System.out.println("Array is not sorted ");
            }
            
        }
        System.out.println("Array is sorted");
    }
}
