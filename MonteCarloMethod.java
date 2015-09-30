
public class MonteCarloMethod {
    
    public static double calcPi() {
        double x, y;
        double count = 0;
        double max = 10000000;
        
        for(int i = 0; i < max; i++) {
            x = Math.random();
            y = Math.random();
            
            if((x * x + y * y) < 1) {
                count++;
            }
        }

        return count / max * 4;
    }

    public static void main(String[] args) {
        System.out.println(calcPi());
    }
}
