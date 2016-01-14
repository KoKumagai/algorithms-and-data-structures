package sorting;

/**
 * Merge Sort
 *
 * Worst case performance       O(n log n)
 * Best case performance        O(n log n)
 * Average case performance     O(n log n)
 * Worst case space complexity  О(n) total, O(n) auxiliary
 */
public class MergeSort {

    public static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int m = arr.length / 2;
            int n = arr.length - m;
            int[] arr1 = new int[m];
            int[] arr2 = new int[n];

            for (int i = 0; i < m; i++) {
                arr1[i] = arr[i];
            }

            for (int i = 0; i < n; i++) {
                arr2[i] = arr[m + i];
            }

            mergeSort(arr1);
            mergeSort(arr2);
            merge(arr1, arr2, arr);
        }
    }

    private static void merge(int[] arr1, int[] arr2, int[] arr) {
        int i = 0;
        int j = 0;
        while (i < arr1.length || j < arr2.length) {
            if (j >= arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {
                arr[i + j] = arr1[i];
                i++;
            } else {
                arr[i + j] = arr2[j];
                j++;
            }
        }
    }

}