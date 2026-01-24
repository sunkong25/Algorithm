package 자바_코딩테스트_대비_입문.two_pointer_sliding_window;

import java.util.Scanner;

public class P30_최대매출 {
	public int solution(int n, int k, int[] num) {
		int answer = 0;
		int sum = 0;

		for (int i = 0; i < k; i++) {
			sum += num[i];
		}
		answer = sum;

		int i = 1, j = k;
		while (j < n) {
			sum = sum - num[i-1] + num[j];
			i++; j++;
			answer = Math.max(answer, sum);
		}

		return answer;
	}
	public static void main(String[] args) {
		P30_최대매출 T = new P30_최대매출();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] num = new int[n];

		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}

		System.out.println(T.solution(n, k, num));
	}
}
