class PBDemo {
	public static void main(String[] args) {
		try {
			ProcessBuilder proc = new ProcessBuilder("open", "-a", "Notes.app");
			proc.start();
		} catch (Exception e) {
			System.out.println("Error executing notes");
		}
	}
}