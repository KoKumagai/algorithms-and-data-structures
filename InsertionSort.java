
public class InsertionSort {
    
    public static void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int key = array[i];
            int j;
            for(j = i - 1; j >= 0 && key < array[j]; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = { 6, 2, 64, 96, 24, 43, 44, 0, 3 };
        insertionSort(array);
        
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}