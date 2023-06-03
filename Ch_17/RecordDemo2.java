// Use a compact record constructor

// Declare an employee record
record Employee(String name, int idNum) {
	// Use a compact canonicalo constructor to remove any leading and trailing
	// spaces from the name string.
	public Employee {
		// Remove any leading and trailing spaces.
		name = name.trim();
	}
}

class RecordDemo2 {
	public static void main(String[] args) {
		Employee[] empList = new Employee[4];

		// Here the name has no leading or trailing spaces.
		empList[0] = new Employee("Doe, John", 1047);
	}
}