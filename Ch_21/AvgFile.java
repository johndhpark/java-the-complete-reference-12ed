
// Use Scanner to compute an average of the values in a file.
import java.util.*;
import java.io.*;

class AvgFile {
    public static void main(String[] args) throws IOException {
        FileWriter fout = new FileWriter("test.txt");
        fout.write("2 3.4 5 6 7.4 9.1 10.5 done");
        fout.close();

        FileReader fin = new FileReader("test.txt");
        try (Scanner scan = new Scanner(fin)) {
            int count = 0;
            double sum = 0;

            while (scan.hasNext()) {
                if (scan.hasNextDouble()) {
                    sum += scan.nextDouble();
                    ++count;
                } else {
                    String cmd = scan.next();

                    if (cmd.equals("done"))
                        break;
                    else {
                        System.out.println("File format error.");
                        return;
                    }
                }
            }

            scan.close();

            System.out.println("Average is " + sum / count);
        }
    }
}