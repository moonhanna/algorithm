package string_and_array;

import java.util.Stack;

public class DailyTemperature {

	public static void main(String[] args) {

		int[] nums = { 73, 74, 75, 71, 69, 72, 76, 73 };
		int[] res = dailyTemperatures(nums);

		System.out.println("====result===");
		for (int i : res) {
			System.out.print(i + " ");
		}

	}

	public static int[] dailyTemperatures(int[] temperatures) {

		Stack<Integer> stack = new Stack<>();
		int[] res = new int[temperatures.length];

		for (int i = 0; i < temperatures.length; i++) {
			while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
				int index = stack.pop();
				res[index] = i - index;
			}
			stack.push(i);
		}

		return res;

	}

}
