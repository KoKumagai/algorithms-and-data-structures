package sorting;

/**
 * Bubble Sort
 *
 * Worst case performance       O(n^2)
 * Best case performance        O(n)
 * Average case performance     O(n^2)
 * Worst case space complexity  O(1) auxiliary
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1); 
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