
public class LinearSearch {
    
    public static int linearSearch(int[] array, int target) {
        for(int i = 0; 0 < array.length; i++) {
            if(array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(linearSearch(array, 7));
    }
}