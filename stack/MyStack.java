package stack;

public class MyStack {
    private int size;
    private int index;
    private int[] stack;

    public MyStack(int size) {
        this.index = 0;
        this.size = size;

        stack = new int[size];
    }

    public int push(int num) {
        if (index >= size) {
            throw new RuntimeException("Stack is overflow");
        }
        return stack[index++] = num;
    }

    public int pop() {
        if (index <= 0) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[--index];
    }

    public int peek() {
        if (index <= 0) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[index - 1];
    }

}
