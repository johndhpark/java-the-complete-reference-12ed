// Demonstrate CharArrayReader

import java.io.*;

class CharArrayReaderDemo {
    public static void main(String[] args) {
        String tmp = "abcdefghijklmnoprstuvwxyz";
        int length = tmp.length();
        char[] src = new char[length];
        tmp.getChars(0, length, src, 0);

        int i;

        try (CharArrayReader input1 = new CharArrayReader(src)) {
            System.out.println("input1 is:");

            while ((i = input1.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }

        try (CharArrayReader input2 = new CharArrayReader(src, 0, 5)) {
            while ((i = input2.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}