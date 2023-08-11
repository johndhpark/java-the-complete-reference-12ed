import java.util.Arrays;

class ArrayClone {
	public static void main(String[] args) {
		int[] origArr = new int[] { 1, 2, 3, 4, 5 };
		int[] clonedArr = origArr.clone();

		for (int i = 0; i < clonedArr.length; ++i) {
			System.out.println(clonedArr[i]);
		}

		clonedArr[0] = 10;

		for (int i = 0; i < clonedArr.length; ++i) {
			System.out.println(origArr[i] + " " + clonedArr[i]);
		}

		System.out.println(Arrays.toString(origArr));

		String[] strs = new String[] { "Hello ", "World", "!" };

		System.out.println(Arrays.toString(strs));
	}
}