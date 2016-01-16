package searching;

/**
 * Linear Search
 *
 * Worst case performance       O(log n)
 * Best case performance        O(1)
 * Average case performance     O(log n)
 */
public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while(low <= high){
            int mid = (high - low) / 2 + low;

            if(array[mid] == target) return mid;

            if(array[low] <= array[mid]){
                if(target < array[mid] && target >= array[low]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if(target > array[mid] && target <= array[high]) {
                    low = mid+1;
                } else {
                    high = mid-1;
                }
            }
        }
        return -1;
    }

}