
// Use a BufferedReader to read characters from the console
import java.io.*;

class BBRead {
	public static void main(String[] args) throws IOException {
		char c;

		Console con = System.console();

		if (con == null)
			return;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter characters 'q' to quit.");

		// read characters

		do {
			c = (char) br.read();

			System.out.println(c);

		} while (c != 'q');

	}

}