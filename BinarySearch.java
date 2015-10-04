
public class BinarySearch {
    
    public static int binarySearch(int[] array, int target){
        int first = 0;
        int last = array.length - 1;
        int middle = (first + last) / 2;;

        while(first <= last){
            if(array[middle] < target) {
                first = middle + 1;
            } else if(array[middle] == target) {
                return middle;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(array, 7));
    }
}