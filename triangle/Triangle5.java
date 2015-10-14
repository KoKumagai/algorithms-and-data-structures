package triangle;

public class Triangle5 {
    public static final int SIZE = 5;

    public static void main(String[] args) {
        int max = (SIZE - 1) * 2 + 1;
        for(int i = 0; i < SIZE; i++) {
            int num = 2 * i + 1;
            
            for(int j = 0; j < (max-num) / 2; j++) {
               System.out.print(" ");
            }
            
            for(int j = 0; j < num; j++) {
                System.out.print("*");
            }
            
            System.out.print("\n");
        }
    }
}
