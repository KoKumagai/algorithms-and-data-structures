package triangle;

public class Triangle1 {
	public static final int SIZE = 5;
    
    public static void main(String[] args) {
        for(int i = 1; i <= SIZE; i++){
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}