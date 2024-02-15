
// Demonstrate Sockets
import java.net.*;
import java.io.*;

class Whois {
    public static void main(String[] args) throws Exception {
        int c;

        // Create a socket connected to internic.net, port 43.
        Socket s = new Socket("whois.internic.net", 43);

        // Obtain input and output streams
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();

        // Construct a request string.
        String req = (args.length == 0 ? "OraclePressBooks.com" : args[0]) + "\n";
        // Convert to bytes.
        byte[] buf = req.getBytes();

        // Send request
        out.write(buf);

        // Read and display response.
        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }

        s.close();
    }
}