public class Average {
	public static void main(String[] args) {
		double[] nums = { 10.1, 11.2, 12.3, 13.4, 14.5 };
		double result = 0;

		for (int index = 0; index < 5; index++) {
			result = result + nums[index];
		}
		System.out.println("Average is " + result / 5);
	}
}