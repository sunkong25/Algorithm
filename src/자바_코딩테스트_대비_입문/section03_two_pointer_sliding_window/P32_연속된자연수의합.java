package 자바_코딩테스트_대비_입문.section03_two_pointer_sliding_window;

import java.util.Scanner;

public class P32_연속된자연수의합 {
	public int solution(int n) {
		int answer = 0;
		int lt = 1, rt = 1;
		int sum = 0;

		while (rt < n) {
			if (sum < n) {
				sum += rt;
				rt++;
			} else {
				sum -= lt;
				lt++;
			}
			if (sum == n) {
				answer++;
			}
		}

		return answer;
	}
	public static void main(String[] args) {
		P32_연속된자연수의합 T = new P32_연속된자연수의합();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.println(T.solution(n));
	}
}
