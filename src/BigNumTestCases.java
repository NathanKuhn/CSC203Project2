import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class BigNumTestCases {
    @Test
    public void testAdd1() {
        LinkedList x = LinkedList.ParseFromString("123");
        LinkedList y = LinkedList.ParseFromString("321");
        assertEquals("444", BigNumArithmetic.add(x, y).toString());
    }

    @Test
    public void testAdd2() {
        LinkedList x = LinkedList.ParseFromString("1111");
        LinkedList y = LinkedList.ParseFromString("1234");
        assertEquals("2345", BigNumArithmetic.add(x, y).toString());
    }

    @Test
    public void testAdd3() {
        LinkedList x = LinkedList.ParseFromString("178346237894618736948173264791563");
        LinkedList y = LinkedList.ParseFromString("39723658123651623945132746813294718635984712636");
        assertEquals("39723658123651802291370641432031666809249504199", BigNumArithmetic.add(x, y).toString());
    }

    @Test
    public void testAdd4() {
        LinkedList x = LinkedList.ParseFromString("198327013650918237412735891237461237462396123784819230707123689127340000");
        LinkedList y = LinkedList.ParseFromString("189374891237491259071238471283904798123748913471732890000009182374891000");
        assertEquals("387701904888409496483974362521366035586145037256552120707132871502231000", BigNumArithmetic.add(x, y).toString());
    }

    @Test
    public void testAdd5() {
        LinkedList x = LinkedList.ParseFromString("9999999999999999999");
        LinkedList y = LinkedList.ParseFromString("1");
        assertEquals("10000000000000000000", BigNumArithmetic.add(x, y).toString());
    }

}
