public class Max {
    public static void main(String[] args) {
        int arr[] = {2,4,5,1,3};
        int a = arr[0];
        for(int i = 0;i<arr.length ;i++){
            if(a<arr[i]){
                a = arr[i];
            }
        }
        System.out.println("The largest element : "+ a);
    }
}
