
public class MergeSort {
    
    public static void mergeSort(int[] array) {
        if(array.length > 1){
            int firstLen = array.length / 2;
            int secondLen = array.length - firstLen;
            int[] first = new int[firstLen];
            int[] second = new int[array.length - firstLen];
            for(int i = 0; i < firstLen; i++) {
                first[i] = array[i];
            }
            for(int i = 0; i < secondLen; i++) {
                second[i] = array[firstLen + i];
            }
            mergeSort(first);
            mergeSort(second);
            merge(first, second, array);
        }
    }
    
    private static void merge(int[] first, int[] second,int[] array) {
        int i = 0;
        int j = 0;
        while(i < first.length || j < second.length) {
            if(j >= second.length || (i < first.length && first[i] < second[j])) {
                array[i + j] = first[i];
                i++;
            } else {
                array[i + j] = second[j];
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = { 6, 2, 64, 96, 24, 43, 44, 0, 3 };
        mergeSort(array);
        
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
