public class Menu {
	public static void main(String[] args) throws java.io.IOException {
		char choice;

		do {
			System.out.println("Help on: ");
			System.out.println("     1: if");
			System.out.println("     2. switch");
			System.out.println("     3. while");
			System.out.println("     4. do-while");
			System.out.println("     5. for\n");
			System.out.println("Choose one: ");

			choice = (char) System.in.read();
		} while (choice < '1' || choice > '5');

		System.out.println("\n");

		switch (choice) {
			case '1':
				System.out.println("The if:\n");
				System.out.println("if(condition) statement;");
				System.out.println("else statement;");
				break;
			case '2':
				System.out.println("The switch:\n");
				System.out.println("switch(expression) {");
				System.out.println("\tcase constant:");
				System.out.println("\tbreak");
				System.out.println("\t//...");
				System.out.println("}");
				break;
		}
	};
}