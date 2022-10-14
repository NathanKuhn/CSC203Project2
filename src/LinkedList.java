
public class LinkedList {
    private int length;
    private Node head;

    public LinkedList(Node head) {
        this.length = 1;
        this.head = head;
    }

    public LinkedList() {
        this.length = 0;
        this.head = null;
    }

    public int getLength() {
        return length;
    }

    public Node getHead() {
        return head;
    }

    public void addNode(int data){

        if (this.head == null) {
            this.head = new Node(data, null);
            length = 1;
            return;
        }

        Node node = new Node(data,null);
        node.setNext(this.head);
        this.head = node;
        this.length += 1;
    }
    public Node pop(){

        if (this.head == null) return null;

        Node temp = this.head;
        this.head = this.head.getNext();
        this.length -= 1;
        return temp;
    }

    public String toString() {
        if (this.length == 0) return "";
        Node temp = this.head;
        StringBuilder total = new StringBuilder();

        for (int i = 0; i < this.length; i++) {
            total.append(temp.getData());
            temp = temp.getNext();
        }

        return total.reverse().toString();
    }

    public static LinkedList ParseFromString(String string) {
        if (string.length() == 0) return new LinkedList();

        LinkedList ret = new LinkedList(new Node(CharToInt(string.charAt(0)), null));

        for (int c = 1; c < string.length(); c++) {
            ret.addNode(CharToInt(string.charAt(c)));
        }

        return ret;
    }

    private static int CharToInt(char c) {
        return Integer.parseInt("" + c);
    }
}
