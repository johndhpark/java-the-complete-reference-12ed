// Demonstrate Runtime.Version release counters.
class VerDemo {
	public static void main(String[] args) {
		Runtime.Version ver = Runtime.version();

		// Display indiivdual counters
		System.out.println("Feature release counter: " + ver.feature());
		System.out.println("Interim release counter: " + ver.interim());
		System.out.println("Update release counter: " + ver.update());
		System.out.println("Patch release counter: " + ver.patch());
		System.out.println("Build info: " + ver.build());
		System.out.println("Pre info: " + ver.pre());
		System.out.println("Optional info: " + ver.optional());
		System.out.println("Versions: " + ver.version());
	}
}