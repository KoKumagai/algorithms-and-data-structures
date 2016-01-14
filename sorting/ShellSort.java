package sorting;

/**
 * Shell Sort
 *
 * Worst case performance       O(n^2)
 * Best case performance        O(n log2 n)
 * Average case performance     depends on gap
 * Worst case space complexity  О(n) total, O(1) auxiliary
 */
public class ShellSort {

    public static void shellSort(int[] arr) {
        int gap = 1;
        while (gap <= arr.length / 3) {
            gap = gap * 3 + 1;
        }

        while (gap > 0) {
            for (int i = gap; i < arr.length; i += gap) {
                int j = i;
                while (j >= gap && arr[j] < arr[j - gap]) {
                    swap(arr, j, j - gap);
                    j -= gap;
                }
            }
            gap = (gap - 1) / 3;
        }
    }

    private static void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

}