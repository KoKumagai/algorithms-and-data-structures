
public class SelectionSort {
    
    public static void selectionSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            int index = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[j] < array[index]) {
                    index = j;
                }
            }
            int temp = array[index]; 
            array[index] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = { 6, 2, 64, 96, 24, 43, 44, 0, 3 };
        selectionSort(array);
        
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
