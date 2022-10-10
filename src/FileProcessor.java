import java.io.File;
import java.io.FileNotFoundException;
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
                    // Handle addition
                } else if (line.contains("*")) {
                    ops = line.split("\\*");
                    // Handle multiplication
                } else if (line.contains("^")) {
                    ops = line.split("\\^");
                    // Handle exponentiation
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + infile.getPath());
        }
    }
}
