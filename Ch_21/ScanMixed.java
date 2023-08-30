
// Use Scanner to read various types of data from a file.
import java.util.*;
import java.io.*;

class ScanMixed {
    public static void main(String[] args) throws IOException {
        int i;
        double d;
        boolean b;
        String str;

        // Write out to a file.

        try (FileWriter fout = new FileWriter("test2.txt");) {
            fout.write("Testing Scanner 10 12.2 one true two false");
        }

        try (FileReader fin = new FileReader("test2.txt"); Scanner scan = new Scanner(fin)) {

            // Read to end
            while (scan.hasNext()) {
                if (scan.hasNextInt()) {
                    i = scan.nextInt();
                    System.out.println("int: " + i);
                } else if (scan.hasNextDouble()) {
                    d = scan.nextDouble();
                    System.out.println("double: " + d);
                } else if (scan.hasNextBoolean()) {
                    b = scan.nextBoolean();
                    System.out.println("boolean: " + b);
                } else {
                    str = scan.next();
                    System.out.println("String: " + str);
                }
            }
        }

    }
}