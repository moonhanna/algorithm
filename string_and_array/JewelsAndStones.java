package string_and_array;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

	public static void main(String[] args) {
		String J = "aA", S = "aAAbbbb";
		System.out.println(solve(J, S));
	}

	public static int solve(String jew, String stone) {

		Set<Character> set = new HashSet<>();

		for (char jewel : jew.toCharArray()) {
			set.add(jewel);
		}

		int count = 0;
		for (char cstone : stone.toCharArray()) {
			if (set.contains(cstone)) {
				count++;
			}
		}

		return count;
	}

}
