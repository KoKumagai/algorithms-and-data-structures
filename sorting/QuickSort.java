package sorting;

/**
 * Quick Sort
 *
 * Worst case performance       O(n^2)
 * Best case performance        O(n log n)
 * Average case performance     O(n log n)
 * Worst case space complexity  O(n) auxiliary
 */
public class QuickSort {

    public static void quicksort(int[] arr) {
        quicksortAux(arr, 0, arr.length - 1);
    }

    private static void quicksortAux(int[] arr, int l, int r) {
        if (l >= r) return;

        int m = partition(arr, arr[l], l + 1, r);
        swap(arr, l, m);
        
        quicksortAux(arr, l, m - 1);
        quicksortAux(arr, m + 1, r);
    }

    private static int partition(int[] arr, int val, int a, int b) {
        int m = a - 1;
        for (int i = a; i <= b; i++) {
            if (arr[i] < val) {
                m++;
                swap(arr, i, m);
            }
        }
        return m;
    }

    private static void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

}