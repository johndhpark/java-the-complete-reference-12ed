class ExecDemo {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		Process p = null;

		try {
			p = r.exec(new String[] { "open", "-a", "Notes.app" });
		} catch (Exception e) {
			System.out.println("Error executing command");
		}
	}
}