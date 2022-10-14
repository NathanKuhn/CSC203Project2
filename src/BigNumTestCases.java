import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class BigNumTestCases {
    @Test
    public void testAdd() {
//        LinkedList x = new LinkedList(new Node(1,null));
//        x.addNode(1);
//        LinkedList y = new LinkedList(new Node(1,null));
//        y.addNode(1);
        LinkedList x =LinkedList.ParseFromString("19999");
        LinkedList y = LinkedList.ParseFromString("11111");
        System.out.print(BigNumArithmetic.add(x,y));

    }

}
