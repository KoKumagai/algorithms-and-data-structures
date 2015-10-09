package triangle;

public class Triangle2 {
    public static final int SIZE = 5;
    
    public static void main(String[] args) {
        for(int i = 1; i <= SIZE; i++){
            for(int j = SIZE; j >= 1; j--) {
                if(j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}