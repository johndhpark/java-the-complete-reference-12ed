// Demonstrate FileInputStream

import java.io.*;

class FileInputStreamDemo2 {
    public static void main(String[] args) {

        // Use try-with-resources to close the stream.
        try (FileInputStream f = new FileInputStream("FileInputStreamDemo.java")) {
            byte[] fullText = f.readAllBytes();

            for (byte c : fullText) {
                System.out.print((char) c);
            }

        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}