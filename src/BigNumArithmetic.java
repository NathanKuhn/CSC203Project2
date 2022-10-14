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

}

