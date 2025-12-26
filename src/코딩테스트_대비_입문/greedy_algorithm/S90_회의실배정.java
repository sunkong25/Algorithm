package 코딩테스트_대비_입문.greedy_algorithm;

import java.util.*;

class Time implements Comparable<Time>{
	int start, end;

	public Time(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Time time) {
		if (this.end == time.end) return this.start - time.start;
		return this.end - time.end;
	}
}
public class S90_회의실배정 {
	public int solution(ArrayList<Time> t) {
		int answer = 0;
		Collections.sort(t);
		int endTime = 0;

		for (Time time : t) {
			if (endTime <= time.start) {
				endTime = time.end;
				answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		S90_회의실배정 T = new S90_회의실배정();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ArrayList<Time> t = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			t.add(new Time(start, end));
		}

		System.out.println(T.solution(t));
	}
}
