package searching;

/**
 * Linear Search
 *
 * Worst case performance       O(n)
 * Best case performance        O(1)
 * Average case performance     O(n)
 */
public class LinearSearch {

    public static int linearSearch(int[] array, int target) {
        for(int i = 0; 0 < array.length; i++) {
            if(array[i] == target) {
                return i;
            }
        }
        return -1;
    }

}