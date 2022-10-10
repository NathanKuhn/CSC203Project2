
public class LinkedClass {
    private int length;
    private Node head;

    public LinkedClass(int length, Node head) {
        this.length = length;
        this.head = head;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}
