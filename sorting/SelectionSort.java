package sorting;

/**
 * Selection Sort
 *
 * Worst case performance       O(n^2)
 * Best case performance        O(n^2)
 * Average case performance     O(n^2)
 * Worst case space complexity  О(n) total, O(1) auxiliary
 */
public class SelectionSort {

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            } 
        }
    }

    private static void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

}