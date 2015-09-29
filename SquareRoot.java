
public class SquareRoot {
    
    public static double calcSquareRoot(double num) {
        if(Double.isNaN(num) || num < 0) {
            return Double.NaN;
        }
        
        double result = num / 2;
        double last = 0;
        
        while(result != last) {
            last = result;
            result = (result + num / result) / 2;
        }
        
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calcSquareRoot(2));
        System.out.println(calcSquareRoot(4));
    }
}
