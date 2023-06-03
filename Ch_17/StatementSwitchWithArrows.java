/**
 * StatementSwitchWithArrows
 */
public class StatementSwitchWithArrows {
	public static void main(String[] args) {
		int up = 0;
		int down = 0;
		int left = 0;
		int right = 0;

		char direction = 'R';

		// Use arrows with a switch statement. Notice that no value is produced
		switch (direction) {
			case 'L' -> {
				System.out.println("Turning left");
				left++;
			}
			case 'R' -> {
				System.out.println("Turning right");
				right++;
			}
			case 'U' -> {
				System.out.println("Moving up");
				up++;
			}
			case 'D' -> {
				System.out.println("Moving down");
			}
		}

		System.out.println(right);
	}
}