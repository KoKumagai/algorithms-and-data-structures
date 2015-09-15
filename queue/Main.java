package queue;

public class Main {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);
        queue.enqueue(3);
        queue.enqueue(8);
        queue.enqueue(2);
        queue.enqueue(5);
        queue.enqueue(7);
        System.out.println(queue.dequeue()); // 3
        System.out.println(queue.dequeue()); // 8
        System.out.println(queue.dequeue()); // 2
        System.out.println(queue.dequeue()); // 5
        System.out.println(queue.dequeue()); // 7
    }
}
