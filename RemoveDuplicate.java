import java.util.*;

public class RemoveDuplicate{
    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] uniqueArray = new int[set.size()];
        int i = 0;
        for (int num : set) {
            uniqueArray[i++] = num;
        }
        return uniqueArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2,3,3,4};
        int[] result = removeDuplicates(arr);
        System.out.println(Arrays.toString(result));
    }
}
