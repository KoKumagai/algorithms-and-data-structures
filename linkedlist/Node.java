package linkedlist;

public class Node {
    private Node link;
    private Object data;

    public Node(Node link, Object data) {
        this.link = link;
        this.data = data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setLink(Node link) {
        this.link = link;
    }

    public Node getLink() {
        return link;
    }
}