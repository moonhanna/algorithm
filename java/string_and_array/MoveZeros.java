package string_and_array;

public class MoveZeros {

	public static void main(String[] args) {

		int[] nums = { 0, 3, 2, 0, 8, 5 };
		int currentIndex = 0;

		for (int i : nums) {
			System.out.print(i + " ");
		}
		System.out.println("\n");

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[currentIndex] = nums[i];
				currentIndex++;
			}
		}

		while (currentIndex < nums.length) {
			nums[currentIndex] = 0;
			currentIndex++;
		}

		for (int i : nums) {
			System.out.print(i + " ");
		}
		
	}
	
}
