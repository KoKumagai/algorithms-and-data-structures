package triangle;

public class Triangle5 {
    public static final int SIZE = 5;

    public static void main(String[] args) {
        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE - (i + 1); j++) {
                System.out.print(" ");
            }

            for(int j = 0; j < (i + 1) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
