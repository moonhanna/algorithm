package string_and_array;

import java.util.*;

class Merge_Interval {
	int start;
	int end;

	Merge_Interval() {
		start = 0;
		end = 0;
	}

	Merge_Interval(int s, int e) {
		start = s;
		end = e;
	}
}

public class MergeInterval {

	public static void main(String[] args) {

		Merge_Interval in1 = new Merge_Interval(1, 3);
		Merge_Interval in2 = new Merge_Interval(2, 6);
		Merge_Interval in3 = new Merge_Interval(15, 18);
		Merge_Interval in4 = new Merge_Interval(8, 10);
		Merge_Interval in5 = new Merge_Interval(9, 20);

		List<Merge_Interval> intervals = new ArrayList<>();
		intervals.add(in1);
		intervals.add(in2);
		intervals.add(in3);
		intervals.add(in4);
		intervals.add(in5);

		MergeInterval a = new MergeInterval();
		a.print(intervals);
		System.out.println("=======sort=======");
		Collections.sort(intervals, a.comp);
		a.print(intervals);
		System.out.println("=======merge=======");
		List<Merge_Interval> list = a.merge(intervals);
		a.print(list);
	}

	public List<Merge_Interval> merge(List<Merge_Interval> intervals) {

		if (intervals.isEmpty()) {
			return intervals;
		}

		List<Merge_Interval> result = new ArrayList<>();

		Merge_Interval before = intervals.get(0);
		for (int i = 1; i < intervals.size(); i++) {

			if (before.end > intervals.get(i).start) {
				before.end = Math.max(before.end, intervals.get(i).end);
			} else {
				result.add(before);
				before = intervals.get(i);
			}

		}

		if (!result.contains(before)) {
			result.add(before);
		}

		return result;
	}

	Comparator<Merge_Interval> comp = new Comparator<Merge_Interval>() {
		public int compare(Merge_Interval a, Merge_Interval b) {
			return a.start - b.start;
		}
	};

	void print(List<Merge_Interval> list) {
		for (int i = 0; i < list.size(); i++) {
			Merge_Interval in = list.get(i);
			System.out.println(in.start + " " + in.end);
		}
	}
}
