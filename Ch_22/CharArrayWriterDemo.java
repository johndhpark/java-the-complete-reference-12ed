// Demonstrate CharArrayWriter.

import java.io.*;

class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter f = new CharArrayWriter();
        String s = "This should end up in the array";
        char[] buf = new char[s.length()];

        s.getChars(0, s.length(), buf, 0);

        try {
            f.write(buf);
        } catch (IOException e) {
            System.out.println("Error writing to buffer");
            return;
        }

        System.out.println("Buffer as a string");
        System.out.println(f.toString());
        System.out.println("Into array");

        char[] c = f.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }

        System.out.println("\n To a FileWriter()");

        // Use try-wit-resources to manage the file stream
        try (FileWriter f2 = new FileWriter("test.txt")) {
            f.writeTo(f2);
        } catch (FileNotFoundException e) {
            System.out.println("Problem with locating the file");
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }

        System.out.print("Doing a reset.");
        f.reset();

        for (int i = 0; i < 3; i++) {
            f.write('X');
        }

        System.out.println(f.toString());
    }
}