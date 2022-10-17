import javax.swing.*;

public class BigNumArithmetic {

    /**
     * The entry point of the program.
     * @param args Command line arguments. Should have exactly one argument: a file name.
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "Expected exactly 1 argument: a file name.");
        }
        String filePath = args[0];
        FileProcessor.processFile(filePath);
    }
    public static LinkedList add(LinkedList x, LinkedList y){
        LinkedList output = new LinkedList();

        int length = x.getLength();
        if (y.getLength() > length) length = y.getLength();

        int currentValue;
        int carry = 0;

        for (int i = 0; i < length; i++){
            currentValue = x.pop() + y.pop() + carry;
            if (currentValue >= 10) {
                carry = 1;
                currentValue %= 10;
            } else {
                carry = 0;
            }
            output.push(currentValue);
        }

        if (carry > 0) output.push(1);

        return output;
    }

    public static LinkedList Multiply(LinkedList x, LinkedList y) {
        LinkedList result = LinkedList.ParseFromString("0");
        Node x_node = x.getHead();
        Node y_node;
        for (int x_i = 0; x_i < x.getLength(); x_i++) {
            LinkedList addend = new LinkedList();
            int carry = 0;
            int digit = 0;
            y_node = y.getHead();
            for (int y_i = 0; y_i < y.getLength(); y_i++) {
                digit = x_node.getData() * y_node.getData() + carry;
                carry = digit / 10;
                digit %= 10;

                addend.push(digit);

                y_node = y_node.getNext();
            }
            if (carry != 0) {
                addend.push(carry);
            }
            for (int zero = 0; zero < x_i; zero++) {
                addend.append(0);
            }
            result = add(result, addend);
            x_node = x_node.getNext();
        }
        return result;
    }

    public static LinkedList Exponent(LinkedList x, int exp) {

        LinkedList residual = LinkedList.ParseFromString("1");

        while (exp > 1) {
            if (exp % 2 == 0) {
                x = Multiply(x, x);
                exp /= 2;
            } else {
                residual = Multiply(residual, x);
                x = Multiply(x, x);
                exp /= 2;
            }
        }

        return Multiply(residual, x);

    }

}

