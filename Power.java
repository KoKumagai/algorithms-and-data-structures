
public class Power {
    
    public static long calcPower(long base, long exponent) {
        long result = 1;
        for(; exponent > 0; exponent >>>= 1) {
            if((exponent & 1) == 1) {
                result *= base;
            }
            base *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calcPower(2,8));
    }
}
