package linkedlist;

public class MyLinkedList {
    private Node head;
    private int  size;

    public MyLinkedList() {
        this.head = new Node(null, null);
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    private Node getNth(int n) {
        int i = -1;
        Node head_copied = head;
        while(head_copied != null) {
            if(n == i) {
                return head_copied;
            }
            i++;
            head_copied = head_copied.getLink();
        }
        throw new IndexOutOfBoundsException();
    }

    public Object get(int n) {
        Node target = getNth(n);
        return target.getData();
    }

    public boolean add(Object data) {
        this.add(size, data);
        return true;
    }

    public boolean add(int n, Object data) {
        Node node1 = getNth(n - 1);
        Node node2 = new Node(node1.getLink(), data);
        node1.setLink(node2);
        size++;
        return true;
    }

    public Object remove(int n) {
        Node node = getNth(n - 1);
        Node node_deleted = node.getLink();
        if(node_deleted == null) {
            throw new IndexOutOfBoundsException();
        }
        node.setLink(node_deleted.getLink());
        size--;
        return node_deleted.getData();
    }

    public void set(int n, Object data) {
        Node target = getNth(n);
        target.setData(data);
    }
}