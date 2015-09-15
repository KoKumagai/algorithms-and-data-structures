package queue;

public class MyQueue {
    private int size;
    private int index;
    private int[] queue;

    public MyQueue(int size) {
        this.size = size;
        this.index = 0;
        this.queue = new int[size];
    }

    public int enqueue(int num) {
        if (index >= size) {
            throw new RuntimeException("Queue is overflow");
        }
        return this.queue[index++] = num;
    }

    public int dequeue() {
        int result;
        if (index <= 0) {
            throw new RuntimeException("Queue is empty");
        }
        result = this.queue[0];
        index--;
        shift(this.queue);
        return result;
    }

    private void shift(int[] array) {
        int queue[] = new int[size];
        for (int i = 0, j = 1; j < array.length; i++, j++) {
            queue[i] = array[j];
        }
        this.queue = queue;
    }
}