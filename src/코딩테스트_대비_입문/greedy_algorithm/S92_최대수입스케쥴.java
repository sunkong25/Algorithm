package 코딩테스트_대비_입문.greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Course implements Comparable<Course> {
	public int price, time;

	public Course(int price, int time) {
		this.price = price;
		this.time = time;
	}

	@Override
	public int compareTo(Course course) {
		return course.time - this.time;
	}
}

public class S92_최대수입스케쥴 {
	static int n, max;

	public int solution(ArrayList<Course> courses) {
		int answer = 0;
		Collections.sort(courses);
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		int j = 0;

		for (int i = max; i >= 1; i--) {
			for (; j < n; j++) {
				if (courses.get(j).time < i) break;
				pQ.offer(courses.get(j).price);
			}
			if (!pQ.isEmpty()) answer += pQ.poll();
		}
		return answer;
	}

	public static void main(String[] args) {
		S92_최대수입스케쥴 T = new S92_최대수입스케쥴();
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		max = Integer.MIN_VALUE;

		ArrayList<Course> courses = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int price = sc.nextInt();
			int time = sc.nextInt();

			max = Math.max(max, time);
			courses.add(new Course(price, time));
		}

		System.out.println(T.solution(courses));
	}
}
