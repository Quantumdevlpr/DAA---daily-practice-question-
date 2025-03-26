public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4};
        int target = 2;
        int index = findLastOccurrence(arr, target);
        
        if (index != -1) {
            System.out.println("Last occurrence of " + target + " is at index: " + index);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                result = mid; 
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

}
