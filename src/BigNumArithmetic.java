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
        while(shorter.getHead()!=null){
            if (shorter.pop().getData()+longer.pop().getData()>=10){
                currentValue = shorter.pop().getData()+longer.pop().getData()%10;
                carry =1;
                output.addNode(currentValue);
            }else{
                currentValue = shorter.pop().getData()+longer.pop().getData()+carry;
                carry =0;
                output.addNode(currentValue);
            }
        }
        return output;
    }

}

