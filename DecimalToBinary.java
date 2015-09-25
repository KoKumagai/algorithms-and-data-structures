
public class DecimalToBinary {
    
    public static long toBinary(int num){
        String binary = "";
        int remainder;
        
        if(num == 0){
            return 0;
        }
        
        if(num < 0) {
            throw new RuntimeException("Not a positive number");
        }
        
        while (num > 0) {
            remainder = num % 2;
            binary = remainder + binary;
            num /= 2;
        }
        
        return Long.parseLong(binary);
    }

    public static void main(String[] args) {
        System.out.println(toBinary(123));
    }
}
