package 자바_코딩테스트_대비_입문.section03_two_pointer_sliding_window;

import java.util.Scanner;

public class S32_연속된자연수의합 {
	public int solution(int n) {
		int answer = 0, sum = 0, lt = 0;
		int m = n / 2 + 1;
		int[] a = new int[m];

		for (int i = 0; i < m; i++) {
			a[i] = i + 1;
		}

		for (int rt = 0; rt < m; rt++) {
			sum += a[rt];
			if (sum == n) {
				answer++;
			}
			while (sum >= n) {
				sum -= a[lt++];
				if(sum == n) answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		S32_연속된자연수의합 T = new S32_연속된자연수의합();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.println(T.solution(n));
	}
}
