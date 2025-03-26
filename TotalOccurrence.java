public class TotalOccurrence {
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                result = mid; 
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
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
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4};
        int target = 2;
        int index = findFirstOccurrence(arr, target);
        int index2 = findLastOccurrence(arr, target);
        if (index != -1) {
            System.out.println("Total occurrence of " + target + " is at index: " );
            for(int i = index; i <= index2; i++) {
                System.out.print(i + " ");
            }

        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}
