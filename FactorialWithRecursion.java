
public class FactorialWithRecursion {

    public static int factorial(int num) {
        int result = 1;
        
        if(num == 0) {
            return result;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(7));
    }
}