package stack;

public class Main {

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(3);
        stack.push(8);
        stack.push(2);
        stack.push(5);
        stack.push(7);
        System.out.println(stack.peek()); // 7
        System.out.println(stack.pop());  // 7
        System.out.println(stack.pop());  // 5
        System.out.println(stack.pop());  // 2
        System.out.println(stack.pop());  // 8
        System.out.println(stack.pop());  // 3
    }
}
