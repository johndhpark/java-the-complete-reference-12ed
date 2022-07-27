class ForEach3 {
	public static void main(String[] args) {
		int sum = 0;
		int[][] nums = new int[3][5];

		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 5; ++j) {
				nums[i][j] = (i + 1) * (j + 1);
			}
		}

		// Use for-each for to display and sum the values
		for (int[] row : nums) {
			for (int num : row) {
				System.out.println("The num is: " + num);
				sum += num;
			}
		}

		System.out.println("The total sum is: " + sum);
	}
}