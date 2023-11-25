// Use a mapped file to reade a file.

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class MappedChannelRead {
    public static void main(String[] args) {

        // Obtain a channel to a file within a try-with-resource block.
        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Path.of("test.txt"))) {

            // Get the size of the file.
            long fSize = fChan.size();

            // Now, map the file into a buffer.
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);

            // Read and display bytes from buffer.
            for (int i = 0; i < fSize; i++) {
                System.out.print((char) mBuf.get());
            }
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}