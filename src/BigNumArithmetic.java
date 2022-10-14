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
        int carry =0;
        LinkedList output = new LinkedList();
        LinkedList shorter;
        LinkedList longer;
        if(x.getLength()>y.getLength()){
            shorter = y;
            longer = x;
        }else {
            shorter = x;
            longer =y;
        }
        int currentValue;
        int tempx;
        int tempy;
        while(shorter.getHead()!=null){
            tempx = shorter.pop().getData();
            tempy = longer.pop().getData();
            if (tempx+tempy>=10){
                currentValue = (tempx+tempy)%10;
                carry =1;
                output.addNode(currentValue);
            }else{
                currentValue = tempx+tempy+carry;
                carry =0;
                output.addNode(currentValue);
            }
        }
        return output;
    }

}

