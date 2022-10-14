import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTestCases {

    @Test
    public void testSetHead() {
       LinkedList x = new LinkedList(new Node(5,null));
       x.addNode(6);
       assertEquals(x.getHead().getData(),6);
       assertEquals(x.getLength(),2);
    }
    @Test
    public void testPop(){
        LinkedList x = new LinkedList(new Node(5,null));
        x.addNode(6);
        assertEquals(x.pop().getData(),6);
    }

    @Test
    public void testStringParsing() {
        String num = "748291234";
        LinkedList list = LinkedList.ParseFromString(num);
        Node n1 = list.getHead();
        Node n2 = n1.getNext();
        Node n3 = n2.getNext();
        Node n4 = n3.getNext();
        assertEquals(4, n1.getData());
        assertEquals(3, n2.getData());
        assertEquals(2, n3.getData());
        assertEquals(1, n4.getData());
        assertEquals(list.toString(), "748291234");
    }


}
