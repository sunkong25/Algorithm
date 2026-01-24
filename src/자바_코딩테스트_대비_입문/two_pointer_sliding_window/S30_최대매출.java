package 자바_코딩테스트_대비_입문.two_pointer_sliding_window;

import java.util.Scanner;

public class S30_최대매출 {
	public int solution(int n, int k, int[] num) {
		int answer, sum = 0;
		for (int i = 0; i < k; i++) {
			sum += num[i];
		}
		answer = sum;

		for (int i = k; i < n; i++) {
			sum += (num[i] - num[i - k]);
			answer = Math.max(answer, sum);
		}
		return answer;
	}
	public static void main(String[] args) {
		S30_최대매출 T = new S30_최대매출();
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
