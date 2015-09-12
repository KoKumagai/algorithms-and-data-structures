
public class FindMaxValue {
    
    public static int findMaxValue(int a, int b, int c, int d) {
        int max = a;
        if(b > max) {
            max = b;
        }
        if(c > max) {
            max = c;
        }
        if(d > max) {
            max = d;
        }
        return max;
    }

    public static void main(String[] args) {
        int max = findMaxValue(43, 65, 100, 9);
        System.out.println("Max value is: " + max);
    }
}
