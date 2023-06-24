// Timing program execution

class Elapsed {
	public static void main(String[] args) {
		long start, end;

		System.out.println("Timing a for loop from 0 to 100,000,000");

		// time a for loop from 0 to 100,000,000.
		start = System.currentTimeMillis();
		for (long i = 0; i < 100_000_000L; ++i) {
		}
		end = System.currentTimeMillis();

		System.out.println("Elapsed time: " + (end - start));
	}
}