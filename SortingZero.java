import java.util.Arrays;

public class SortingZero {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 3, 5};
        
        moveZeroesAtEnd(arr);
        
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroesAtEnd(int[] nums){
        int n = nums.length;
        int j = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        while(j < n){
            nums[j] = 0;
            j++;
        }
    }
}
