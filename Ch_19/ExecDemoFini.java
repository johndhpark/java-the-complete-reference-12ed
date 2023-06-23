// Wait until Notes is terminated
class ExecDemoFini {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		Process p = null;

		String[] cmds = new String[] { "open", "-a", "Notes" };

		try {
			p = r.exec(cmds);
			p.waitFor();
		} catch (Exception err) {
			System.out.println("Error executing Notes");
		}

		System.out.println("Notes returned " + p.exitValue());
	}
}