package 자바_코딩테스트_대비_입문.two_pointer_sliding_window;

import java.util.Scanner;

public class P31_연속부분수열 {
	public int solution(int n, int m, int[] num) {
		int answer = 0, sum = 0;

		int i = 0;
		for (int j = 0; j < n; j++) {
			sum += num[j];
			if (sum == m) {
				answer++;
			}
			while (sum >= m) {
				sum-=num[i++];
				if (sum == m) {
					answer++;
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		P31_연속부분수열 T = new P31_연속부분수열();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] num = new int[n];

		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}

		System.out.println(T.solution(n, m, num));
	}
}
