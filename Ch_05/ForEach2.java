/**
 * ForEach2
 */
public class ForEach2 {

	public static void main(String[] args) {
		int sum = 0;
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int num : nums) {
			System.out.println("Value is: " + num);

			sum += num;

			if (num == 5)
				break;
		}

		System.out.println("Sum of the first 5 elements is: " + sum);
	}
}