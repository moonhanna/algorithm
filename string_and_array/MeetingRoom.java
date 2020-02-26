package string_and_array;

import java.util.Arrays;
import java.util.Comparator;


class Interval {
	int start;
	int end;

	Interval() {
		this.start = 0;
		this.end = 0;
	}

	Interval(int s, int e) {
		this.start = s;
		this.end = e;
	}

}

public class MeetingRoom {

	public static void main(String[] args) {

		MeetingRoom a = new MeetingRoom();

		Interval in1 = new Interval(15, 20);
		Interval in2 = new Interval(5, 10);
		Interval in3 = new Interval(0, 30);
		
		//Interval in1 = new Interval(0, 10);
		//Interval in2 = new Interval(15, 20);
		//Interval in3 = new Interval(25, 30);

		Interval[] intervals = { in1, in2, in3 };
		System.out.println(a.solve(intervals));
	}

	public boolean solve(Interval[] intervals) {
		if (intervals == null)
			return false;

		print(intervals);
		Arrays.sort(intervals, Comp);
		System.out.println("===sort====");
		print(intervals);
		System.out.println("===result====");

		for (int i = 1; i < intervals.length; i++) {
			if (intervals[i - 1].end > intervals[i].start)
				return false;
		}

		return true;

	}

	public void print(Interval[] intervals) {
		for (int i = 0; i < intervals.length; i++) {
			Interval in = intervals[i];
			System.out.println(in.start + " " + in.end);

		}
	}

	Comparator<Interval> Comp = new Comparator<Interval>() {

		@Override
		public int compare(Interval o1, Interval o2) {
			return o1.start - o2.start;
		}

	};

}
