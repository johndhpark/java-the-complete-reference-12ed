// Demonstrate FileWriter

import java.io.*;

class FileWriterDemo {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n"
                + " to come to the aid of their country\n"
                + " and pay their due taxes.";

        char[] buffer = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);

        try (FileWriter fw1 = new FileWriter("fw1.txt");
                FileWriter fw2 = new FileWriter("fw2.txt");
                FileWriter fw3 = new FileWriter("fw3.txt")) {

            // write to first file
            for (int i = 0; i < buffer.length; i += 2) {
                fw1.write(buffer[i]);
            }

            // write to second file
            fw2.write(buffer);

            // write to the third file
            fw3.write(buffer, buffer.length - buffer.length / 4, buffer.length / 4);

        } catch (FileNotFoundException e) {
            System.out.println("Error opening file");
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}