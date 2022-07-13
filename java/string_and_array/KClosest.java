package string_and_array;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KClosest {

	public static void main(String[] args) {

		KClosest a = new KClosest();

		int[][] points = { { 1, 3 }, { -2, 2 } };
		int k = 1;

		int[][] result = a.solve(points, k);
		a.print(result);

	}

	public int[][] solve(int[][] points, int k) {

		int[][] result = new int[k][2];
		Queue<int[]> queue = new PriorityQueue<int[]>(points.length, Comp);
		int index = 0;

		for (int[] p : points) {
			queue.offer(p);
		}

		while (index < k) {
			result[index] = queue.poll();
			index++;
		}

		return result;

	}

	Comparator<int[]> Comp = new Comparator<int[]>() {

		@Override
		public int compare(int[] o1, int[] o2) {
			return (o1[0] * o1[0] + o1[1] * o1[1]) - (o2[0] * o2[0] + o2[1] * o2[1]);
		}

	};

	public void print(int[][] result) {

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
		}
	}

}
