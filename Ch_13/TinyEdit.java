
// A tiny editor
import java.io.*;

class TinyEdit {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] strs = new String[100];

		System.out.println("Enter lines of text.");
		System.out.println("Enter 'stop' to quit.");

		for (int i = 0; i < 100; ++i) {
			strs[i] = br.readLine();

			if (strs[i].equals("stop"))
				break;
		}

		System.out.println("\nHere is your file: ");

		// display the lines
		for (int i = 0; i < 100; ++i) {
			if (strs[i].equals("stop")) {
				break;
			}

			System.out.println(strs[i]);
		}
	}
}