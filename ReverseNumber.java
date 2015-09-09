import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseNumber {

    public static void main(String[] args) {
        int number = 0;
        int reverse = 0;
        
        System.out.println("Enter the number to reverse: ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            number = Integer.parseInt(in.readLine());
        } catch (Exception e) {
            number = 0;
        }
   
        while( number != 0 ) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        
        System.out.println("Reverse of the number is: "+reverse);
    }
}
