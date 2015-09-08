
public class QuickSort {

    private static int partition(int array[], int left, int right) {
        int i = left;
        int j = right;
        int pivot = array[(left + right) / 2];
         
        while(i <= j) {
            while(array[i] < pivot) {
                i++;
            }
            while(array[j] > pivot) {
                j--;
            }
            if(i <= j) {
                int tmep = array[i];
                array[i] = array[j];
                array[j] = tmep;
                i++;
                j--;
            }
        }
        return i;
    }
    
    public static void quickSort(int array[], int left, int right) {
        int i = partition(array, left, right);
        if(left < i - 1) {
            quickSort(array, left, i-1);
        }
        if(i < right) {
            quickSort(array, i, right);
        }
    }
    
    public static void main(String[] args) {
        int[] array = { 6, 2, 64, 96, 24, 43, 44, 0, 3 };
        quickSort(array, 0, array.length-1);
        
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
