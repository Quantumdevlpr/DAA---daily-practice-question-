public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,4};
        int largest = 5;
        int secondLargest = arr[0];
        for(int i = 0;i<arr.length ; i++){
             if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Largest element is : "+ secondLargest);
    }
    
}
