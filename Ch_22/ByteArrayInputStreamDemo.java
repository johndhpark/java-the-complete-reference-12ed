
// Demonstrate ByteArrayInputStream.
import java.io.*;

class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String tmp = "abcdefghijklmnopqrstuvxyz";
        byte[] b = tmp.getBytes();
        int c;

        ByteArrayInputStream input1 = new ByteArrayInputStream(b);
        ByteArrayInputStream input2 = new ByteArrayInputStream(b, 0, 3);
        System.out.println("Reading byte array complete.");

        System.out.println("These are the characters in input1: ");
        while ((c = input1.read()) != -1) {
            System.out.print((char) c + " ");
        }

        System.out.println("\nThese are the characters in put2: ");
        while ((c = input2.read()) != -1) {
            System.out.print((char) c + "");
        }

        System.out.println("input1 non-overridden .toString() method result: " + input1.toString());
        System.out.println("input2 non-overridden .toString() method result: " + input2.toString());
    }
}