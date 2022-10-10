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
    }


}
