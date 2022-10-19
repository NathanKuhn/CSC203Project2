import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileProcessor {

    /**
     * Processes arithmetic expressions line-by-line in the given file.
     *
     * @param filePath Path to a file containing arithmetic expressions.
     */
    public static void processFile(String filePath) {
        File infile = new File(filePath);
        try (Scanner scan = new Scanner(infile)) {
            while (scan.hasNext()) {
                // TODO: Process each line of the input file here.
                String line = scan.nextLine();
                line = line.replaceAll(" ", "");
                if (line.length() == 0)
                    continue;

                String[] ops;

                if (line.contains("+")) {
                    ops = line.split("\\+");
                    LinkedList op1 = LinkedList.ParseFromString(ops[0]);
                    LinkedList op2 = LinkedList.ParseFromString(ops[1]);
                    System.out.println(ops[0] + " + " + ops[1] + " = " + BigNumArithmetic.add(op1, op2));
                } else if (line.contains("*")) {
                    ops = line.split("\\*");
                    LinkedList op1 = LinkedList.ParseFromString(ops[0]);
                    LinkedList op2 = LinkedList.ParseFromString(ops[1]);
                    System.out.println(ops[0] + " * " + ops[1] + " = " + BigNumArithmetic.Multiply(op1, op2));
                } else if (line.contains("^")) {
                    ops = line.split("\\^");
                    LinkedList op1 = LinkedList.ParseFromString(ops[0]);
                    int op2 = Integer.parseInt(ops[1]);
                    System.out.println(ops[0] + " ^ " + ops[1] + " = " + BigNumArithmetic.Exponent(op1, op2));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + infile.getPath());
        }
    }
}
