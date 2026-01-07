package 자바_코딩테스트_대비_입문.greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body> {
	int h, w;

	public Body(int h, int w) {
		this.h = h;
		this.w = w;
	}

	@Override
	public int compareTo(Body o) {
		return o.h - this.h;
	}
}

public class S89_씨름선수 {
	public int solution(ArrayList<Body> body) {
		int answer = 0;
		int max = Integer.MIN_VALUE;
		for (Body b : body) {
			if (max < b.w) {
				answer++;
				max = b.w;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		S89_씨름선수 T = new S89_씨름선수();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ArrayList<Body> b = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();

			b.add(new Body(h, w));
		}
		Collections.sort(b);

		System.out.println(T.solution(b));
	}
}
