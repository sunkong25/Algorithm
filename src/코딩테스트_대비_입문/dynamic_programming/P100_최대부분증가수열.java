package 코딩테스트_대비_입문.dynamic_programming;

import java.util.Scanner;

public class P100_최대부분증가수열 {
	public int solution(int[] a) {
		int answer = 0;
		int[] dy = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			int max = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (a[j] < a[i] && max < dy[j]) {
					max = dy[j];
				}
			}
			dy[i] = max + 1;
			answer = Math.max(answer, dy[i]);
		}

		return answer;
	}
	public static void main(String[] args) {
		P100_최대부분증가수열 T = new P100_최대부분증가수열();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println(T.solution(a));
	}
}
