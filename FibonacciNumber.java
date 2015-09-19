
public class FibonacciNumber {
    
    public static int getFibonacciNumber(int num) {
        if(num == 0) {
            return 0;
        }
        if(num == 1) {
            return 1;
        }
        return getFibonacciNumber(num - 1) + getFibonacciNumber(num - 2);
    }

    public static void main(String[] args) {
        System.out.println(getFibonacciNumber(0));
        System.out.println(getFibonacciNumber(1));
        System.out.println(getFibonacciNumber(6));
    }
}
