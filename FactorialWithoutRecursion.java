
public class FactorialWithoutRecursion {
    
    public static int factorial(int num) {
        int result = 1;
        
        while (num > 0) {
            result *= num;
            num--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(7));
    }
}