package sorting;

/**
 * Insertion Sort
 *
 * Worst case performance       O(n^2)
 * Best case performance        O(n)
 * Average case performance     O(n^2)
 * Worst case space complexity  О(n) total, O(1) auxiliary
 */
public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            while(j >= 0 && arr[j] > arr[j + 1]) {
              swap(arr, j, j + 1);
              j--;
            }
        }
    }

    private static void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

}