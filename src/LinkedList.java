
public class LinkedList {
    private int length;
    private Node head;

    public LinkedList(Node head) {
        this.length = 1;
        this.head = head;
    }

    public int getLength() {
        return length;
    }

    public Node getHead() {
        return head;
    }

    public void addNode(int data){
        Node node = new Node(data,null);
        node.setNext(this.head.getNext());
        this.head = node;
        this.length +=1;
    }
    public Node pop(){
        Node current = null;
        for (int i=0; i<this.length; i++){
            current=this.head.getNext();
        }
        this.length = this.length-1;
        return current;
    }
}
